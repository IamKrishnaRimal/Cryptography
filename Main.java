class Main {


  private static String cipherText = "";


  public static String encryption(int key, String plainText)
  {
    plainText = plainText.toLowerCase();

    char base = ' ';
    int encrypt;

    for(int i = 0; i < plainText.length(); i++)
    {
      if(plainText.charAt(i) >= 'a' && plainText.charAt(i) <= 'z')
        base = 'a';
        
        if(plainText.charAt(i) == ' ')
        {
          cipherText += plainText.charAt(i);
          continue;
        }

        encrypt = ((int)plainText.charAt(i) - (int)base - key) % 26 + (int)base;
        // encrypt = ((int)plainText.charAt(i) - key) % 26;
        cipherText += (char)encrypt;
    }

    return cipherText.toUpperCase();
  }

  public static String decryption(int key, String cipherText)
  {
    String plainText = "";
    int decrypt;
    char base = 'a';

    for(int i = 0; i < cipherText.length(); i++)
    {

      if(cipherText.charAt(i) == ' ')
      {
        plainText += cipherText.charAt(i);
        continue;
      }

      decrypt = ((int)cipherText.charAt(i) - (int)base + key) % 26 + (int)base;
      plainText += (char)decrypt;
    }

    return plainText.toLowerCase();
  }

  public static void main(String[] args) {

    String cipher = encryption(3, "Rahul Rimal");
    System.out.println("Cipher: "+cipher);

    String plain = decryption(3, cipher);
    System.out.println("Plain: "+plain);
  }
}


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
          cipherText += plainText.charAt(i);

        encrypt = ((int)plainText.charAt(i) - (int)base - key) % 26 + base;
        cipherText += (char)encrypt;
    }

    return cipherText.toUpperCase();
  }



  public static void main(String[] args) {

    String cipher = encryption(3, "Rahul Rimal");
    System.out.println("Cipher: "+cipher);
  }
}


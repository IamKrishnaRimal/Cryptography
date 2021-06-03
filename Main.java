class Main {

  public static char normalChar[] = 
    {
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
      'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
      'u', 'v', 'w', 'x', 'y', 'z'
    };

    public static char codeChar[] =
    {
      'Q','W','E','R','T','Y','U','I','O','P',
      'A','S','D','F','G','H','J','K','L',
      'Z','X','C','V','B','N','M'
    };

    public static String cipherText = "";

  public static String monoEncryption( String plainText)
  {

    plainText = plainText.toLowerCase();

    for(int i = 0; i < plainText.length(); i ++)
    {

      if(plainText.charAt(i) == ' ')
      {
        cipherText += ' ';
        continue;
      }

      for(int j = 0; j < 26; j++)
      {
        if(plainText.charAt(i) == normalChar[j])
          cipherText += codeChar[j];
      }

    }

    return cipherText;
  }


  public static String decryption(String cipherText)
  {
    String plainText = "";

    cipherText = cipherText.toUpperCase();

    for(int i = 0; i < cipherText.length(); i++)
    {
      if(cipherText.charAt(i) == ' ')
      {
        plainText += ' ';
        continue;
      }

      for(int j = 0; j < 26; j++)
      {
        if(cipherText.charAt(i) == codeChar[j])
          plainText += normalChar[j];
      }
    }


    return plainText;
  }




  public static void main(String[] args) {
    String cipher =  monoEncryption("Rahul Rimal");

    String decrypt = decryption(cipher);
    
    System.out.println("Encrypted: "+cipher);
    System.out.println("Decrypted: "+ decrypt);


  }
}

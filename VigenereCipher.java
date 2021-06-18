

class VigenereCipher
{

  private String key = "";
  private String plainText = "";
  private String cipher = "";
  private int len;
  private int[] cipherNum = new int[len];
  
  public VigenereCipher(String key, String plainText)
  {
    this.key = key;
    this.plainText = plainText;
    this.len = plainText.length();
  }

  public void keyGen()
  {
    String newKey = key;
    if(key.length() < plainText.length())
    {
      for(int i = key.length(); i < plainText.length(); i++)
      {
        newKey += key.charAt(i % key.length());
      }
    }
    else if(key.length() > plainText.length())
    {
      System.out.println("Key is greater than plain text");
    }
    key = newKey;
    System.out.println("Key: "+ key);

  }

  public int[] keyNumbering()
  {
    int[] numberkey = new int[key.length()];

    for(int i=0; i<key.length(); i++)
    {
      numberkey[i] = (int)key.charAt(i) - 97;
    }
    return numberkey;

  }

  public int[] plainTextNumbering()
  {
    int[] plainNumber = new int[plainText.length()];

    for(int i=0; i<plainText.length(); i++)
    {
      plainNumber[i] = (int)plainText.charAt(i) - 97;
    }

    return plainNumber;
  }

  public void encrypt()
  {
    int[] numberingKey = keyNumbering();
    int[] numberingPlain = plainTextNumbering();
    int[] numberingCipher = new int[numberingKey.length];

    for(int i = 0; i < numberingKey.length; i++)
    {
      numberingCipher = (numberingPlain[i] + numberingKey[i]) % 26;
    }

    for(int i = 0; i < numberingCipher.length; i++)
    {
      cipher += (char)(numberingCipher[i] + 97); 
    }


  }

  public void decrypt()
  {
    int[] numberingKey = keyNumbering();

    for(int i = 0; i < cipherNum.length; i++)
    {

    }

  }




  public static void main(String[] args)
  {
    VigenereCipher vc = new VigenereCipher("hello", "VigenereCipher");

    vc.encrypt();

  }



}

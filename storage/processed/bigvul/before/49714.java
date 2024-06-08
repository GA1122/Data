class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* FLAW: Set data to a hardcoded value */
                data = "23 ~j;asn!@#/>as";
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                if (data != null)
                {
                    String stringToEncrypt = "Super secret Squirrel";
                    byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
                    /* POTENTIAL FLAW: Use data as a cryptographic key */
                    SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
                    Cipher aesCipher = Cipher.getInstance("AES");
                    aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                    byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
                    IO.writeLine(IO.toHex(byteCipherText)); /* Write encrypted data to console */
                }
    
            }
        }
};
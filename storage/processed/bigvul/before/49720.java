class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = goodG2BSource();
    
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
};
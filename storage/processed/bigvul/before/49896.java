class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                final String CIPHER_INPUT = "ABCDEFG123456";
                KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
                /* Perform initialization of KeyGenerator */
                keyGenerator.init(112);
                SecretKey secretKey = keyGenerator.generateKey();
                byte[] byteKey = secretKey.getEncoded();
                /* FLAW: Use a weak crypto algorithm, 3DES */
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "DESede");
                Cipher tripleDesCipher = Cipher.getInstance("DESede");
                tripleDesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                byte[] encrypted = tripleDesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
                IO.writeLine(IO.toHex(encrypted));
            }
            else
            {
    
                final String CIPHER_INPUT = "ABCDEFG123456";
    
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
    
                /* Perform initialization of KeyGenerator */
                keyGenerator.init(128);
    
                SecretKey secretKey = keyGenerator.generateKey();
                byte[] byteKey = secretKey.getEncoded();
    
                /* FIX: Use a stronger crypto algorithm, AES */
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
    
                Cipher aesCipher = Cipher.getInstance("AES");
                aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
    
                byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
    
                IO.writeLine(IO.toHex(encrypted));
    
            }
        }
};
class good1_class{
    private void good1() throws Throwable
        {
            if (false)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                final String CIPHER_INPUT = "ABCDEFG123456";
    
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
    
                /* FIX: Perform initialization of KeyGenerator */
                keyGenerator.init(256);
    
                SecretKey secretKey = keyGenerator.generateKey();
                byte[] byteKey = secretKey.getEncoded();
    
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
    
                Cipher aesCipher = Cipher.getInstance("AES");
                aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
    
                byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
    
                IO.writeLine(IO.toHex(encrypted));
    
            }
        }
};
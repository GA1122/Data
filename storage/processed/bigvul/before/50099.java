class bad_class{
    public void bad() throws Throwable
        {
    
            byte[] text = "asdf".getBytes("UTF-8");
            byte[] initializationVector =
            {
                0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
                0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00
            };
    
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey key = keyGenerator.generateKey();
    
            /* FLAW: hardcoded initialization vector used */
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(initializationVector);
    
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
    
            IO.writeLine(IO.toHex(cipher.doFinal(text)));
    
        }
};
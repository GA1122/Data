class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                byte[] text = "asdf".getBytes("UTF-8");
    
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                SecretKey key = keyGenerator.generateKey();
    
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    
                int blockSize = cipher.getBlockSize();
                byte[] initializationVector = new byte[blockSize];
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextBytes(initializationVector);
    
                /* FIX: using cryptographically secure pseudo-random number as initialization vector */
                IvParameterSpec ivParameterSpec = new IvParameterSpec(initializationVector);
    
                cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
    
                IO.writeLine(IO.toHex(cipher.doFinal(text)));
    
            }
        }
};
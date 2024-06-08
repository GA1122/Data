class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
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
        }
};
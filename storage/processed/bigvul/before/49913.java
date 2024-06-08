class bad_class{
    public void bad() throws Throwable
        {
            if (true)
            {
                final String CIPHER_INPUT = "ABCDEFG123456";
                KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
                /* Perform initialization of KeyGenerator */
                keyGenerator.init(56);
                SecretKey secretKey = keyGenerator.generateKey();
                byte[] byteKey = secretKey.getEncoded();
                /* FLAW: Use a weak crypto algorithm, DES */
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "DES");
                Cipher desCipher = Cipher.getInstance("DES");
                desCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                byte[] encrypted = desCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
                IO.writeLine(IO.toHex(encrypted));
            }
        }
};
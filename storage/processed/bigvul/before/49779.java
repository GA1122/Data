class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                final String CIPHER_INPUT = "ABCDEFG123456";
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                /* FLAW: Skip initialization of KeyGenerator (like 'keyGenerator.init(128);')
                 * According to the KeyGenerator JavaDoc: "In case the client does not explicitly
                 * initialize the KeyGenerator (via a call to an init method), each provider must
                 * supply (and document) a default initialization." This means that the cryptographic
                 * provider will decide what length the key will be (128, 192, or 256 bits for AES)
                 * which may cause a smaller key than desired to be used and may cause interoperability
                 * issues when different providers are used.
                 */
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
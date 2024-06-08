class bad_class{
    public void bad() throws Throwable
        {
            if (privateTrue)
            {
                /* FLAW: encrytped "calc.exe" */
                String payload = "0297b5eb43e3b81f9c737b353c3ade45";
                Cipher aesCipher = Cipher.getInstance("AES");
                /* INCIDENTAL: Hardcoded crypto */
                SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
                /* Convert hex string to byte array without the use of a library
                 * adopted from: http://stackoverflow.com/questions/140131/convert-a-string-representation-of-a-hex-dump-to-a-byte-array-using-java */
                int payloadLength = payload.length();
                byte[] data = new byte[payloadLength/2];
                for (int i = 0; i < payloadLength; i+=2)
                {
                    data[i/2] = (byte)((Character.digit(payload.charAt(i), 16) << 4) + Character.digit(payload.charAt(i+1), 16));
                }
                String decryptedPayload = new String(aesCipher.doFinal(data), "UTF-8");
                try
                {
                    Runtime.getRuntime().exec(decryptedPayload);
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
                }
            }
        }
};
class goodB2G1Sink_class{
    private void goodB2G1Sink(String password ) throws Throwable
        {
            if (goodB2G1Private)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                if (password != null)
                {
                    KerberosPrincipal principal = new KerberosPrincipal("test");
                    /* FIX: Decrypt password before using in KerberosKey() */
                    {
                        Cipher aesCipher = Cipher.getInstance("AES");
                        /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                        SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                        aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
                        password = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
                    }
                    KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                    IO.writeLine(key.toString());
                }
    
            }
        }
};
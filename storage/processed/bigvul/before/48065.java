class goodB2G1Sink_class{
    public void goodB2G1Sink(String password ) throws Throwable
        {
            if (CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_kerberosKey_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
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
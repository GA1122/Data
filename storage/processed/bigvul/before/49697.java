class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                data = ""; /* Initialize data */
                /* read user input from console with readLine */
                try
                {
                    InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                    /* FIX: Read data from the console using readLine() */
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (data != null)
            {
                String stringToEncrypt = "Super secret Squirrel";
                byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
                /* POTENTIAL FLAW: Use data as a cryptographic key */
                SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
                Cipher aesCipher = Cipher.getInstance("AES");
                aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
                IO.writeLine(IO.toHex(byteCipherText)); /* Write encrypted data to console */
            }
    
        }
};
class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String password;
            if (privateTrue)
            {
                password = ""; /* init password */
                /* Read data using a listening tcp connection */
                {
                    ServerSocket listener = null;
                    Socket socket = null;
                    BufferedReader readerBuffered = null;
                    InputStreamReader readerInputStream = null;
                    try
                    {
                        /* read input from socket */
                        listener = new ServerSocket(39543);
                        socket = listener.accept();
                        readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read password using a listening tcp connection */
                        password = readerBuffered.readLine();
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* clean up stream reading objects */
                        try
                        {
                            if (readerBuffered != null)
                            {
                                readerBuffered.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                        }
    
                        try
                        {
                            if (readerInputStream != null)
                            {
                                readerInputStream.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                        }
    
                        /* clean up socket objects */
                        try
                        {
                            if (socket != null)
                            {
                                socket.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                        }
    
                        try
                        {
                            if (listener != null)
                            {
                                listener.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing ServerSocket", exceptIO);
                        }
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
            }
    
            if (privateTrue)
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
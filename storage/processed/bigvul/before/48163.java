class bad_class{
    public void bad() throws Throwable
        {
            String password;
    
            password = ""; /* init password */
    
            /* Read data using an outbound tcp connection */
            {
                Socket socket = null;
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    /* Read data using an outbound tcp connection */
                    socket = new Socket("host.example.org", 39544);
    
                    /* read input from socket */
    
                    /* POTENTIAL FLAW: Read password using an outbound tcp connection */
                    readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
    
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
                }
            }
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            while (true)
            {
                data = ""; /* Initialize data */
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
                        readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data using an outbound tcp connection */
                        data = readerBuffered.readLine();
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
                break;
            }
    
            while (true)
            {
                int numberOfLoops;
                try
                {
                    numberOfLoops = Integer.parseInt(data);
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i=0; i < numberOfLoops; i++)
                {
                    /* POTENTIAL FLAW: user supplied input used for loop counter test */
                    IO.writeLine("hello world");
                }
                break;
            }
        }
};
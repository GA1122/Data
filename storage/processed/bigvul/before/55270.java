class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                data = Integer.MIN_VALUE; /* Initialize data */
                {
                    ServerSocket listener = null;
                    Socket socket = null;
                    BufferedReader readerBuffered = null;
                    InputStreamReader readerInputStream = null;
                    /* Read data using a listening tcp connection */
                    try
                    {
                        listener = new ServerSocket(39543);
                        socket = listener.accept();
                        /* read input from socket */
                        readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data using a listening tcp connection */
                        String stringNumber = readerBuffered.readLine();
                        if (stringNumber != null) // avoid NPD incidental warnings
                        {
                            try
                            {
                                data = Integer.parseInt(stringNumber.trim());
                            }
                            catch(NumberFormatException exceptNumberFormat)
                            {
                                IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                            }
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* Close stream reading objects */
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
    
                        /* Close socket objects */
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
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: test for a zero modulus */
                if (data != 0)
                {
                    IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a modulo by zero");
                }
    
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
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
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                int array[] = null;
                /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
                if (data >= 0)
                {
                    array = new int[data];
                }
                else
                {
                    IO.writeLine("Array size is negative");
                }
                /* do something with the array */
                array[0] = 5;
                IO.writeLine(array[0]);
            }
            else
            {
    
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = null;
    
                /* FIX: Verify that data is non-negative AND greater than 0 */
                if (data > 0)
                {
                    array = new int[data];
                }
                else
                {
                    IO.writeLine("Array size is negative");
                }
    
                /* do something with the array */
                array[0] = 5;
                IO.writeLine(array[0]);
    
            }
        }
};
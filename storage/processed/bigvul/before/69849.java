class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            data = ""; /* Initialize data */
    
            {
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
    
                /* read user input from console with readLine */
                try
                {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
    
                    /* POTENTIAL FLAW: Read data from the console using readLine */
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
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
                }
            }
            /* NOTE: Tools may report a flaw here because buffread and isr are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
    
            /* serialize data to a byte array */
            ByteArrayOutputStream streamByteArrayOutput = null;
            ObjectOutput outputObject = null;
    
            try
            {
                streamByteArrayOutput = new ByteArrayOutputStream() ;
                outputObject = new ObjectOutputStream(streamByteArrayOutput) ;
                outputObject.writeObject(data);
                byte[] dataSerialized = streamByteArrayOutput.toByteArray();
                (new CWE643_Xpath_Injection__console_readLine_75b()).goodB2GSink(dataSerialized  );
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException in serialization", exceptIO);
            }
            finally
            {
                /* clean up stream writing objects */
                try
                {
                    if (outputObject != null)
                    {
                        outputObject.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ObjectOutputStream", exceptIO);
                }
    
                try
                {
                    if (streamByteArrayOutput != null)
                    {
                        streamByteArrayOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ByteArrayOutputStream", exceptIO);
                }
            }
        }
};
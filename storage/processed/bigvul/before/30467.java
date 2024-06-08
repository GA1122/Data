class bad_class{
    public void bad() throws Throwable
        {
            byte data = 0;
    
            /* init data */
            data = -1;
    
            /* POTENTIAL FLAW: Read data from console with readLine*/
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
    
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
    
                String stringNumber = readerBuffered.readLine();
                if (stringNumber != null)
                {
                    data = Byte.parseByte(stringNumber.trim());
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat);
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
                finally
                {
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
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__byte_console_readLine_predec_22b()).badSink(data );
        }
};
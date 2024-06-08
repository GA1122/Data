class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            data = -1.0f; /* Initialize data */
    
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;
    
            /* read user input from console with readLine */
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
    
                /* POTENTIAL FLAW: Read data from the console using readLine */
                String stringNumber = readerBuffered.readLine();
    
                if (stringNumber != null) // avoid NPD incidental warnings
                {
                    try
                    {
                        data = Float.parseFloat(stringNumber.trim());
                    }
                    catch (NumberFormatException exceptNumberFormat)
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
            }
    
            LinkedList<Float> dataLinkedList = new LinkedList<Float>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE369_Divide_by_Zero__float_console_readLine_divide_73b()).badSink(dataLinkedList  );
        }
};
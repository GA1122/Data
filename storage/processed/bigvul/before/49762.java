class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
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
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE321_Hard_Coded_Cryptographic_Key__basic_74b()).goodG2BSink(dataHashMap  );
        }
};
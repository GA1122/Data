class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            data = ""; /* init data */
    
            /* FIX: Read data from the console using readLine() */
            try
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
    
                /* POTENTIAL FLAW: Read data from the console using readLine */
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
    
            /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
    
            for (int i = 0; i < 1; i++)
            {
                if (data != null)
                {
                    KerberosPrincipal principal = new KerberosPrincipal("test");
                    /* POTENTIAL FLAW: data used as password in KerberosKey() */
                    KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                    IO.writeLine(key.toString());
                }
            }
        }
};
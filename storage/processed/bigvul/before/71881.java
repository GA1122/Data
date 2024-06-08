class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (true)
            {
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (true)
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};
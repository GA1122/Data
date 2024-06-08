class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
                break;
            }
        }
};
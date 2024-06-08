class goodB2G_class{
    private void goodB2G() throws Throwable
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
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
                break;
            }
        }
};
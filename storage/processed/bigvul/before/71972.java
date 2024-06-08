class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
    
            }
        }
};
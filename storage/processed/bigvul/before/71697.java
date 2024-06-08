class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};
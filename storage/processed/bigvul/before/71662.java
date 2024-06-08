class goodB2GSink_class{
    public void goodB2GSink(String data ) throws Throwable
        {
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};
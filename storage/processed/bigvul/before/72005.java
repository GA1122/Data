class goodB2GSink_class{
    public void goodB2GSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};
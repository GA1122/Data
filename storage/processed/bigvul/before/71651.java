class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            String data = dataGoodB2G;
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};
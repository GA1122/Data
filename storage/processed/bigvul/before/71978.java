class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = goodB2GSource();
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};
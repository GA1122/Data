class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            while (true)
            {
                /* FIX: Use data */
                IO.writeLine(data);
                break;
            }
        }
};
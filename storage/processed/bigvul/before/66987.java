class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FIX: Use data */
                IO.writeLine(data);
            }
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            for (int k = 0; k < 1; k++)
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data);
            }
        }
};
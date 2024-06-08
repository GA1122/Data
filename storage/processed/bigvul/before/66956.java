class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = new StringBuilder("Good");
    
            if (IO.staticTrue)
            {
                /* FIX: Use data */
                IO.writeLine(data.toString());
            }
        }
};
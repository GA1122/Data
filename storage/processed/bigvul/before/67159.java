class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            if (IO.staticFive == 5)
            {
                /* FIX: Initialize then use data */
                data = new StringBuilder("Good");
                IO.writeLine(data.toString());
            }
        }
};
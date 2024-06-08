class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            while (true)
            {
                /* FIX: Initialize then use data */
                data = new StringBuilder("Good");
                IO.writeLine(data.toString());
                break;
            }
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = "Good";
                break;
            }
    
            while (true)
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data);
                break;
            }
        }
};
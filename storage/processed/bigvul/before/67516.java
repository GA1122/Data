class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = "Good";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine(data);
    
            }
        }
};
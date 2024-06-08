class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            StringBuilder data;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = new StringBuilder("Good");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            }
    
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data.toString());
                break;
            }
        }
};
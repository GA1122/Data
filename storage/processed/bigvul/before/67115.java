class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            switch (7)
            {
            case 7:
                /* FIX: Initialize then use data */
                data = 5L;
                IO.writeLine("" + data);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
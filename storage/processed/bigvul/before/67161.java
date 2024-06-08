class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                /* FIX: Initialize then use data */
                data = new StringBuilder("Good");
                IO.writeLine(data.toString());
                break;
            }
        }
};
class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                /* FIX: Use data */
                IO.writeLine("" + data);
                break;
            }
        }
};
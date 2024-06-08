class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Don't initialize or use data */
            ; /* empty statement needed for some flow variants */
    
            if (PRIVATE_STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Initialize then use data */
    
                data = 5L;
    
                IO.writeLine("" + data);
    
            }
        }
};
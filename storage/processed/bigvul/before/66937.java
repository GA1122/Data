class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = new StringBuilder("Good");
    
            if (PRIVATE_STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Use data */
    
                IO.writeLine(data.toString());
    
            }
        }
};
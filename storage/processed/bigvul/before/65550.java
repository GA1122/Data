class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: data is null */
                data = null;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: validate that data is non-null */
                if (data != null)
                {
                    IO.writeLine("" + data.length());
                }
                else
                {
                    IO.writeLine("data is null");
                }
    
            }
        }
};
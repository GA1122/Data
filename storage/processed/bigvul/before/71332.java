class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            StringBuilder data;
            if (IO.staticFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: call getStringBuilderGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            }
    
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
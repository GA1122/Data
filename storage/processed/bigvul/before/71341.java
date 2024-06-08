class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            while (true)
            {
                /* FIX: call getStringBuilderGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
                break;
            }
    
        }
};
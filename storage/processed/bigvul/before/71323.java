class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: call getStringBuilderGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
            }
            else
            {
    
                /* FIX: call getStringBuilderGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
            else
            {
    
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
    
                IO.writeLine(stringTrimmed);
    
            }
        }
};
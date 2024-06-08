class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: call getStringGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
            }
            else
            {
    
                /* FIX: call getStringGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
            else
            {
    
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
    
                IO.writeLine(stringTrimmed);
    
            }
        }
};
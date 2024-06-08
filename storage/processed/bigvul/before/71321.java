class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
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
    
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.toString().trim();
                    IO.writeLine(stringTrimmed);
                }
    
            }
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
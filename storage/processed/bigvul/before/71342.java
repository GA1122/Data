class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
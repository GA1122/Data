class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: Initialize and use data before it is overwritten */
    
            data = new StringBuilder("Good");
    
            IO.writeLine(data.toString());
    
            CWE563_Unused_Variable__unused_value_StringBuilder_81_base baseObject = new CWE563_Unused_Variable__unused_value_StringBuilder_81_goodG2B();
            baseObject.action(data );
        }
};
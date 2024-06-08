class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            /* FIX: Initialize and use data before it is overwritten */
    
            data = 5L;
    
            IO.writeLine("" + data);
    
            CWE563_Unused_Variable__unused_value_long_81_base baseObject = new CWE563_Unused_Variable__unused_value_long_81_goodG2B();
            baseObject.action(data );
        }
};
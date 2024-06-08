class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            CWE78_OS_Command_Injection__database_81_base baseObject = new CWE78_OS_Command_Injection__database_81_goodG2B();
            baseObject.action(data );
        }
};
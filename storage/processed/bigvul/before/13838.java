class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            CWE15_External_Control_of_System_or_Configuration_Setting__Environment_81_base baseObject = new CWE15_External_Control_of_System_or_Configuration_Setting__Environment_81_goodG2B();
            baseObject.action(data );
        }
};
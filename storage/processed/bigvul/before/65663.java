class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            CWE476_NULL_Pointer_Dereference__String_81_base baseObject = new CWE476_NULL_Pointer_Dereference__String_81_goodG2B();
            baseObject.action(data );
        }
};
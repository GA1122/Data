class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = null;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            goodG2BPublicStatic = true;
            (new CWE476_NULL_Pointer_Dereference__String_22b()).goodG2BSink(data );
        }
};
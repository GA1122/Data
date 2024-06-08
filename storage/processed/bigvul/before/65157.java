class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data = null;
    
            /* FIX: hardcode data to non-null */
            data = Integer.valueOf(5);
    
            goodG2BPublicStatic = true;
            (new CWE476_NULL_Pointer_Dereference__Integer_22b()).goodG2BSink(data );
        }
};
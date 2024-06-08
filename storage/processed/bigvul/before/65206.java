class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data;
    
            /* FIX: hardcode data to non-null */
            data = Integer.valueOf(5);
    
            CWE476_NULL_Pointer_Dereference__Integer_81_base baseObject = new CWE476_NULL_Pointer_Dereference__Integer_81_goodG2B();
            baseObject.action(data );
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            CWE476_NULL_Pointer_Dereference__Integer_81_base baseObject = new CWE476_NULL_Pointer_Dereference__Integer_81_bad();
            baseObject.action(data );
        }
};
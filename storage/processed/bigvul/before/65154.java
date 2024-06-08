class bad_class{
    public void bad() throws Throwable
        {
            Integer data = null;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            badPublicStatic = true;
            (new CWE476_NULL_Pointer_Dereference__Integer_22b()).badSink(data );
        }
};
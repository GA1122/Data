class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data = null;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            badPublicStatic = true;
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_22b()).badSink(data );
        }
};
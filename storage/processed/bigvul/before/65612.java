class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            goodB2G1PublicStatic = false;
            (new CWE476_NULL_Pointer_Dereference__String_22b()).goodB2G1Sink(data );
        }
};
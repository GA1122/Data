class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int [] data = null;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            goodB2G2PublicStatic = true;
            (new CWE476_NULL_Pointer_Dereference__int_array_22b()).goodB2G2Sink(data );
        }
};
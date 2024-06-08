class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int [] data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            CWE476_NULL_Pointer_Dereference__int_array_81_base baseObject = new CWE476_NULL_Pointer_Dereference__int_array_81_goodB2G();
            baseObject.action(data );
        }
};
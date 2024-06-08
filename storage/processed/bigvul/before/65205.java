class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            CWE476_NULL_Pointer_Dereference__Integer_81_base baseObject = new CWE476_NULL_Pointer_Dereference__Integer_81_goodB2G();
            baseObject.action(data );
        }
};
class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            Integer data = CWE476_NULL_Pointer_Dereference__Integer_68a.data;
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};
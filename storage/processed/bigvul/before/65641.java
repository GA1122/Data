class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            String data = CWE476_NULL_Pointer_Dereference__String_68a.data;
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};
class goodB2GSink_class{
    public void goodB2GSink(CWE476_NULL_Pointer_Dereference__String_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
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
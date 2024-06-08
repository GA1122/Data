class goodB2GSink_class{
    public void goodB2GSink(CWE476_NULL_Pointer_Dereference__Integer_67a.Container dataContainer ) throws Throwable
        {
            Integer data = dataContainer.containerOne;
    
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
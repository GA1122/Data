class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Integer[] dataArray = new Integer[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__Integer_66b()).goodB2GSink(dataArray  );
        }
};
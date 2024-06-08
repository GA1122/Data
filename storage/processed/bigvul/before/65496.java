class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            StringBuilder[] dataArray = new StringBuilder[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_66b()).goodB2GSink(dataArray  );
        }
};
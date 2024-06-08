class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int [] data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__int_array_67b()).goodB2GSink(dataContainer  );
        }
};
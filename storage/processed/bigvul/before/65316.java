class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int [] data;
    
            /* FIX: hardcode data to non-null */
            data = new int[5];
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__int_array_67b()).goodG2BSink(dataContainer  );
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: hardcode data to non-null */
            data = new StringBuilder();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_67b()).goodG2BSink(dataContainer  );
        }
};
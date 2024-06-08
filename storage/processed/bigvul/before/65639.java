class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__String_67b()).goodG2BSink(dataContainer  );
        }
};
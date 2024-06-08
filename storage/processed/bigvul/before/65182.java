class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data;
    
            /* FIX: hardcode data to non-null */
            data = Integer.valueOf(5);
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__Integer_67b()).goodG2BSink(dataContainer  );
        }
};
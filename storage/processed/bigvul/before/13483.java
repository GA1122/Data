class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE15_External_Control_of_System_or_Configuration_Setting__connect_tcp_67b()).goodG2BSink(dataContainer  );
        }
};
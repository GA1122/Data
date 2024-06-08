class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE15_External_Control_of_System_or_Configuration_Setting__connect_tcp_66b()).goodG2BSink(dataArray  );
        }
};
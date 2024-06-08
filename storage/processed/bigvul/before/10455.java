class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE134_Uncontrolled_Format_String__connect_tcp_printf_67b()).goodG2BSink(dataContainer  );
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE78_OS_Command_Injection__Property_67b()).goodG2BSink(dataContainer  );
        }
};
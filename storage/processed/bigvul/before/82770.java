class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE89_SQL_Injection__Property_executeUpdate_67b()).goodB2GSink(dataContainer  );
        }
};
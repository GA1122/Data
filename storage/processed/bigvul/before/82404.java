class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE89_SQL_Injection__Property_executeBatch_66b()).goodB2GSink(dataArray  );
        }
};
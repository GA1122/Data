class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE606_Unchecked_Loop_Condition__Property_67b()).goodB2GSink(dataContainer  );
        }
};
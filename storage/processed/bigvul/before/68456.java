class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded int as a string */
            data = "5";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE606_Unchecked_Loop_Condition__Environment_67b()).goodG2BSink(dataContainer  );
        }
};
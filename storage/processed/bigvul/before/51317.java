class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            float data;
    
            /* FIX: Use a hardcoded number that won't a divide by zero */
            data = 2.0f;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE369_Divide_by_Zero__float_Environment_divide_67b()).goodG2BSink(dataContainer  );
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE369_Divide_by_Zero__float_zero_modulo_67b()).goodB2GSink(dataContainer  );
        }
};
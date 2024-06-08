class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a negative value */
            data = -1;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_67b()).goodB2GSink(dataContainer  );
        }
};
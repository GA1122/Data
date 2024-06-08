class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            data = 0; /* POTENTIAL FLAW: data is set to zero */
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__int_zero_modulo_66b()).goodB2GSink(dataArray  );
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            float[] dataArray = new float[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__float_zero_divide_66b()).goodB2GSink(dataArray  );
        }
};
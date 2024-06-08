class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            float data;
    
            /* FIX: Use a hardcoded number that won't a divide by zero */
            data = 2.0f;
    
            float[] dataArray = new float[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__float_console_readLine_modulo_66b()).goodG2BSink(dataArray  );
        }
};
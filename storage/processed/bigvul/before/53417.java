class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            float[] dataArray = new float[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__float_zero_divide_66b()).badSink(dataArray  );
        }
};
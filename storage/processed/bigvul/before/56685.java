class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            data = 0; /* POTENTIAL FLAW: data is set to zero */
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__int_zero_divide_66b()).badSink(dataArray  );
        }
};
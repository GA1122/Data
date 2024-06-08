class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE191_Integer_Underflow__short_min_sub_66b()).goodB2GSink(dataArray  );
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            long[] dataArray = new long[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__long_max_square_66b()).goodB2GSink(dataArray  );
        }
};
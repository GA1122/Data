class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__short_max_preinc_66b()).goodB2GSink(dataArray  );
        }
};
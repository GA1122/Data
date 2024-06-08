class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__int_max_postinc_66b()).goodB2GSink(dataArray  );
        }
};
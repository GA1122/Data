class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE191_Integer_Underflow__int_min_sub_66b()).goodB2GSink(dataArray  );
        }
};
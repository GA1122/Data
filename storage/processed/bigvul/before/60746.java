class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            int[] countArray = new int[5];
            countArray[2] = count;
            (new CWE400_Resource_Exhaustion__max_value_for_loop_66b()).goodB2GSink(countArray  );
        }
};
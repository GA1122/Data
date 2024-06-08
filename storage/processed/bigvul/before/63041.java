class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            int[] countArray = new int[5];
            countArray[2] = count;
            (new CWE400_Resource_Exhaustion__sleep_max_value_66b()).badSink(countArray  );
        }
};
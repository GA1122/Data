class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Set data to Integer.MAX_VALUE */
            data = Integer.MAX_VALUE;
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_66b()).badSink(dataArray  );
        }
};
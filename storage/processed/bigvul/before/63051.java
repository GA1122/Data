class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            Vector<Integer> countVector = new Vector<Integer>(5);
            countVector.add(0, count);
            countVector.add(1, count);
            countVector.add(2, count);
            (new CWE400_Resource_Exhaustion__sleep_max_value_72b()).badSink(countVector  );
        }
};
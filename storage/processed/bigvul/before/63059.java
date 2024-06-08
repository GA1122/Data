class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            HashMap<Integer,Integer> countHashMap = new HashMap<Integer,Integer>();
            countHashMap.put(0, count);
            countHashMap.put(1, count);
            countHashMap.put(2, count);
            (new CWE400_Resource_Exhaustion__sleep_max_value_74b()).badSink(countHashMap  );
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            HashMap<Integer,Integer> countHashMap = new HashMap<Integer,Integer>();
            countHashMap.put(0, count);
            countHashMap.put(1, count);
            countHashMap.put(2, count);
            (new CWE400_Resource_Exhaustion__sleep_random_74b()).goodB2GSink(countHashMap  );
        }
};
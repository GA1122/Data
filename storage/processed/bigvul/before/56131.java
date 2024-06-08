class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            HashMap<Integer,Integer> dataHashMap = new HashMap<Integer,Integer>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE369_Divide_by_Zero__int_random_divide_74b()).badSink(dataHashMap  );
        }
};
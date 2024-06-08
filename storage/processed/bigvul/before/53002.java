class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            HashMap<Integer,Float> dataHashMap = new HashMap<Integer,Float>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE369_Divide_by_Zero__float_random_modulo_74b()).goodB2GSink(dataHashMap  );
        }
};
class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Integer> dataHashMap ) throws Throwable
        {
            int data = dataHashMap.get(2);
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Short> dataHashMap ) throws Throwable
        {
            short data = dataHashMap.get(2);
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
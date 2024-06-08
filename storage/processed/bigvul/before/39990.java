class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Long> dataHashMap ) throws Throwable
        {
            long data = dataHashMap.get(2);
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
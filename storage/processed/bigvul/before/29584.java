class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Short> dataHashMap ) throws Throwable
        {
            short data = dataHashMap.get(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
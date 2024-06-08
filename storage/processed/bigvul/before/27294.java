class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Long> dataHashMap ) throws Throwable
        {
            long data = dataHashMap.get(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
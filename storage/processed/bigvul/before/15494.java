class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Byte> dataHashMap ) throws Throwable
        {
            byte data = dataHashMap.get(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
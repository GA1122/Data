class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Byte> dataHashMap ) throws Throwable
        {
            byte data = dataHashMap.get(2);
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
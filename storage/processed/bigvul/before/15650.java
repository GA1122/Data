class badSink_class{
    public void badSink(HashMap<Integer,Byte> dataHashMap ) throws Throwable
        {
            byte data = dataHashMap.get(2);
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
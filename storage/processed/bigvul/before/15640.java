class goodG2BSink_class{
    public void goodG2BSink(Vector<Byte> dataVector ) throws Throwable
        {
            byte data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
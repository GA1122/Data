class goodG2BSink_class{
    public void goodG2BSink(byte dataArray[] ) throws Throwable
        {
            byte data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
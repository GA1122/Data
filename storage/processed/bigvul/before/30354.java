class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            byte data = (Byte)dataObject;
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
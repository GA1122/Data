class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            byte result = (byte)(--data);
    
            IO.writeLine("result: " + result);
    
        }
};
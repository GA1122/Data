class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            byte result = (byte)(data + 1);
    
            IO.writeLine("result: " + result);
    
        }
};
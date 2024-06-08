class bad_class{
    public void bad() throws Throwable
        {
            byte data = badSource();
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
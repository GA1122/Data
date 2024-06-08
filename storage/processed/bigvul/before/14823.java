class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data = goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
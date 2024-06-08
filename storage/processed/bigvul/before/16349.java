class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            byte data = dataGoodG2B;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
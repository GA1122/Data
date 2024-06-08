class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data = goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
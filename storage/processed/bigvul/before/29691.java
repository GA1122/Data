class bad_class{
    public void bad() throws Throwable
        {
            short data = badSource();
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
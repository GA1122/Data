class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            short result = (short)(data + 1);
    
            IO.writeLine("result: " + result);
    
        }
};
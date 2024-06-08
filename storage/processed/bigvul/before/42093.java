class bad_class{
    public void bad() throws Throwable
        {
            short dataCopy;
            {
                short data;
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MIN_VALUE;
    
                dataCopy = data;
            }
            {
                short data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                short result = (short)(data - 1);
    
                IO.writeLine("result: " + result);
    
            }
        }
};
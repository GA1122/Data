class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MAX_VALUE;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
                short result = (short)(++data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};
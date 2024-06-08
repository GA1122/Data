class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MIN_VALUE;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                short result = (short)(--data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};
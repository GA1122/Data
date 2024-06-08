class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MIN_VALUE;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                byte result = (byte)(data - 1);
                IO.writeLine("result: " + result);
                break;
            }
        }
};
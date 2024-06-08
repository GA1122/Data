class bad_class{
    public void bad() throws Throwable
        {
            byte dataCopy;
            {
                byte data;
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MAX_VALUE;
    
                dataCopy = data;
            }
            {
                byte data = dataCopy;
    
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
    
            }
        }
};
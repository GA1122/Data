class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            byte data = (Byte)dataObject;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
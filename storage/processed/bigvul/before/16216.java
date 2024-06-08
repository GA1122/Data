class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            byte data = (Byte)dataObject;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
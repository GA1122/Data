class goodG2BSink_class{
    public void goodG2BSink(byte dataArray[] ) throws Throwable
        {
            byte data = dataArray[2];
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
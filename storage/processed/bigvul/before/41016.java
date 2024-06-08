class goodG2BSink_class{
    public void goodG2BSink(short dataArray[] ) throws Throwable
        {
            short data = dataArray[2];
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
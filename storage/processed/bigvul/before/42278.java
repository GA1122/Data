class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            short data = (Short)dataObject;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
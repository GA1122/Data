class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            short data = dataGoodG2B;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
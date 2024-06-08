class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            short data = (Short)dataObject;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            int data = (Integer)dataObject;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
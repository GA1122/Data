class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            int data = (Integer)dataObject;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};
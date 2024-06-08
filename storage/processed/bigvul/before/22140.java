class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            /* POTENTIAL FLAW: if (data*data) > Integer.MAX_VALUE, this will overflow */
            int result = (int)(data * data);
    
            IO.writeLine("result: " + result);
    
        }
};
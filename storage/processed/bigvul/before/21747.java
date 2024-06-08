class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
                break;
            }
    
            while (true)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            }
        }
};
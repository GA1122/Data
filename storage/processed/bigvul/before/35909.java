class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
                break;
            }
    
            while (true)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            }
        }
};
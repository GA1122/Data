class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (privateReturnsTrue())
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (privateReturnsTrue())
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};
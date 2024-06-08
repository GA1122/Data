class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (true)
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (true)
            {
                /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
                data++;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
        }
};
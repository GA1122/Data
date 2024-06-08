class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (true)
            {
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (true)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(--data);
                IO.writeLine("result: " + result);
            }
        }
};
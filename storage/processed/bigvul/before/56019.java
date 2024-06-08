class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (PRIVATE_STATIC_FINAL_TRUE)
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
    
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
                result in an exception. */
                IO.writeLine("bad: 100/" + data + " = " + (100 / data) + "\n");
            }
        }
};
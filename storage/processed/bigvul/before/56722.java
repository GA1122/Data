class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (5==5)
            {
                data = 0; /* POTENTIAL FLAW: data is set to zero */
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (5==5)
            {
                /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
                result in an exception.  */
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                data = 0; /* POTENTIAL FLAW: data is set to zero */
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
                result in an exception. */
                IO.writeLine("bad: 100/" + data + " = " + (100 / data) + "\n");
                break;
            }
        }
};
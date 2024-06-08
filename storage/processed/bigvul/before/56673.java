class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                data = 0; /* POTENTIAL FLAW: data is set to zero */
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
                result in an exception. */
                IO.writeLine("bad: 100/" + data + " = " + (100 / data) + "\n");
    
            }
        }
};
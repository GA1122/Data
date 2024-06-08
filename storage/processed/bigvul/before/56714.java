class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            data = 0; /* POTENTIAL FLAW: data is set to zero */
    
            /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
            result in an exception.  */
            IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
    
        }
};
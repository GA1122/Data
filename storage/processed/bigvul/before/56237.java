class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
                result in an exception.  */
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
    
            }
        }
};
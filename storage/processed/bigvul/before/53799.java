class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
                result in an exception.  */
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
                break;
            }
    
        }
};
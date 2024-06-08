class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
                result in an exception. */
                IO.writeLine("bad: 100/" + data + " = " + (100 / data) + "\n");
            }
        }
};
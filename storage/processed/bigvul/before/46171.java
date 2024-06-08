class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                try
                {
                    throw new UnsupportedOperationException();
                }
                catch (UnsupportedOperationException exceptUnsupportedOperation)
                {
                    exceptUnsupportedOperation.printStackTrace(); /* FLAW: Print stack trace to console on error */
                }
            }
            else
            {
    
                try
                {
                    throw new UnsupportedOperationException();
                }
                catch (UnsupportedOperationException exceptUnsupportedOperation)
                {
                    IO.writeLine("There was an unsupported operation error"); /* FIX: print a generic message */
                }
    
            }
        }
};
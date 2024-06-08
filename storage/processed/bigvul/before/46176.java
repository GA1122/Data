class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticFive == 5)
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
        }
};
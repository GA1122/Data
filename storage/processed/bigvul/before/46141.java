class bad_class{
    public void bad() throws Throwable
        {
            if (true)
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
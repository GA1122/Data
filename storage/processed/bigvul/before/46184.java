class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
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
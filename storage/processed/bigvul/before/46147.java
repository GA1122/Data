class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
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
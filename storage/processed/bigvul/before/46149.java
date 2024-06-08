class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
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
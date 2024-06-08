class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticFive == 5)
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
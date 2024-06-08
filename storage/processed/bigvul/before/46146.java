class good2_class{
    private void good2() throws Throwable
        {
            if (5 == 5)
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
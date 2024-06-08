class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                try
                {
                    throw new UnsupportedOperationException();
                }
                catch (UnsupportedOperationException exceptUnsupportedOperation)
                {
                    IO.writeLine("There was an unsupported operation error"); /* FIX: print a generic message */
                }
                break;
            }
        }
};
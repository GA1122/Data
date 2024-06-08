class goodG2BSink_class{
    private void goodG2BSink(long data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};
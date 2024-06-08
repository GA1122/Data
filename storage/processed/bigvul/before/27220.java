class goodG2BSink_class{
    private void goodG2BSink(long data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};
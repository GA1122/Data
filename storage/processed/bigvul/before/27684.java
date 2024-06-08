class goodG2BSink_class{
    private void goodG2BSink(long data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: if (data*data) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};
class badSink_class{
    private void badSink(long data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if (data*data) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};
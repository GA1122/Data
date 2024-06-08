class badSink_class{
    private void badSink(int data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if (data*data) > Integer.MAX_VALUE, this will overflow */
                int result = (int)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};
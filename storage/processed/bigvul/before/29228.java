class badSink_class{
    private void badSink(short data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if (data*data) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};
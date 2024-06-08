class badSink_class{
    private void badSink(short data ) throws Throwable
        {
            if (badPrivate)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};
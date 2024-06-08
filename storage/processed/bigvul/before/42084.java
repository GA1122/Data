class goodG2BSink_class{
    private void goodG2BSink(short data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                short result = (short)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};
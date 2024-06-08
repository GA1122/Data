class goodG2BSink_class{
    private void goodG2BSink(byte data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: if (data*data) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};
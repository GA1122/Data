class goodG2BSink_class{
    private void goodG2BSink(byte data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                byte result = (byte)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};
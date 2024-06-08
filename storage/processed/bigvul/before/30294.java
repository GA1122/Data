class goodG2BSink_class{
    private void goodG2BSink(byte data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                data--;
                byte result = (byte)(data);
                IO.writeLine("result: " + result);
            }
        }
};
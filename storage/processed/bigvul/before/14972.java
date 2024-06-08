class badSink_class{
    private void badSink(byte data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(++data);
                IO.writeLine("result: " + result);
            }
        }
};
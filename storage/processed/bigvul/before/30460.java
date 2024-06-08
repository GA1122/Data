class badSink_class{
    private void badSink(byte data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                byte result = (byte)(--data);
                IO.writeLine("result: " + result);
            }
        }
};
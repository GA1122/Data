class badSink_class{
    private void badSink(int data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
                int result = (int)(++data);
                IO.writeLine("result: " + result);
            }
        }
};
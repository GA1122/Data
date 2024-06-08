class badSink_class{
    private void badSink(int data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
        }
};
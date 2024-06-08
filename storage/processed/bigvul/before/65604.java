class badSink_class{
    private void badSink(String data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
        }
};
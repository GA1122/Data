class badSink_class{
    private void badSink(StringBuilder data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
        }
};
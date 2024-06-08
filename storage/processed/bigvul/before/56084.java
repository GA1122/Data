class badSink_class{
    private void badSink(int data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
                result in an exception. */
                IO.writeLine("bad: 100/" + data + " = " + (100 / data) + "\n");
            }
        }
};
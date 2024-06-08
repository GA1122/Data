class badSink_class{
    private void badSink(float data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
        }
};
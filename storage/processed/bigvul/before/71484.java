class badSink_class{
    private void badSink(String data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
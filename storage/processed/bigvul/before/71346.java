class badSink_class{
    private void badSink(StringBuilder data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
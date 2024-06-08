class goodG2BSink_class{
    private void goodG2BSink(String data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};
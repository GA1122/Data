class goodG2BSink_class{
    private void goodG2BSink(StringBuilder data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                /* FLAW: Use of deprecated Date.parse(String) method */
                long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
                IO.writeLine(unixDate); /* Use unixDate */
            }
        }
};
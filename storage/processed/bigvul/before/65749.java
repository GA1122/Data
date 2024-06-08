class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FLAW: Use of deprecated Date.parse(String) method */
                long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
                IO.writeLine(unixDate); /* Use unixDate */
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
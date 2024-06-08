class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Use of deprecated Date.parse(String) method */
                long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
                IO.writeLine(unixDate); /* Use unixDate */
            }
            else
            {
    
                /* FIX: Use preferred DateFormat.parse(String) method */
                java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
    
                IO.writeLine(date.toString()); /* Use date */
    
            }
        }
};
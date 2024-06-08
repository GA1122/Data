class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use preferred DateFormat.parse(String) method */
                java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
                IO.writeLine(date.toString()); /* Use date */
            }
            else
            {
    
                /* FIX: Use preferred DateFormat.parse(String) method */
                java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
    
                IO.writeLine(date.toString()); /* Use date */
    
            }
        }
};
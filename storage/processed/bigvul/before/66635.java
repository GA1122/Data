class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: This is the suspicious comment */
                /* BUG: There is a bug at this location...I'm not sure why! */
                IO.writeLine("This a test of the emergency broadcast system");
            }
            else
            {
    
                /* FIX: don't have those types of comments :) */
                IO.writeLine("This a test of the emergency broadcast system");
    
            }
        }
};
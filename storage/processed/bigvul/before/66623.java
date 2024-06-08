class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                /* FLAW: This is the suspicious comment */
                /* BUG: There is a bug at this location...I'm not sure why! */
                IO.writeLine("This a test of the emergency broadcast system");
            }
        }
};
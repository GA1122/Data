class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                /* FLAW: This is the suspicious comment */
                /* FIXME: There is a bug at this location...I'm not sure why! */
                IO.writeLine("This a test of the emergency broadcast system");
            }
        }
};
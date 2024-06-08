class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                /* FLAW: This is the suspicious comment */
                /* TODO: There is a bug at this location...I'm not sure why! */
                IO.writeLine("This a test of the emergency broadcast system");
            }
        }
};
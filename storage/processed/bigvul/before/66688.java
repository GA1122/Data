class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FLAW: This is the suspicious comment */
                /* FIXME: There is a bug at this location...I'm not sure why! */
                IO.writeLine("This a test of the emergency broadcast system");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
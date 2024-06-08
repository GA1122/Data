class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FLAW: assertion is false */
                assert "".length() > 0;
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
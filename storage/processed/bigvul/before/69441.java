class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FLAW: this assertion can be reached, and will always trigger (if code is compiled using -ea option to enable assert) */
                assert false; /* INCIDENTAL: CWE 571 - expression is always true - it's "true" because assert(e) basically does if (!(e)) */
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
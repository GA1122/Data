class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: this assertion can be reached, and will always trigger (if code is compiled using -ea option to enable assert) */
                assert false; /* INCIDENTAL: CWE 571 - expression is always true - it's "true" because assert(e) basically does if (!(e)) */
            }
            else
            {
    
                /* FIX: ensure assertions cannot be triggered, in this case, to avoid an empty
                 * function, assert true */
                assert true; /* INCIDENTAL: CWE 570 - expression is always false - it's "false" because assert(e) basically does if (!(e)) */
    
            }
        }
};
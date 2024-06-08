class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FLAW: this assertion can be reached, and will always trigger (if code is compiled using -ea option to enable assert) */
                assert false; /* INCIDENTAL: CWE 571 - expression is always true - it's "true" because assert(e) basically does if (!(e)) */
            }
        }
};
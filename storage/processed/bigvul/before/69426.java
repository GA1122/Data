class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                /* FIX: ensure assertions cannot be triggered, in this case, to avoid an empty
                 * function, assert true */
                assert true; /* INCIDENTAL: CWE 570 - expression is always false - it's "false" because assert(e) basically does if (!(e)) */
            }
        }
};
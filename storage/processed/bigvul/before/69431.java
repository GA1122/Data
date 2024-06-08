class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsFalse())
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: ensure assertions cannot be triggered, in this case, to avoid an empty
                 * function, assert true */
                assert true; /* INCIDENTAL: CWE 570 - expression is always false - it's "false" because assert(e) basically does if (!(e)) */
    
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                /* FLAW: Math.random() is a known weak PRNG */
                IO.writeLine("" + Math.random());
            }
        }
};
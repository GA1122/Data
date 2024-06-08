class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticFive == 5)
            {
                /* FLAW: Math.random() is a known weak PRNG */
                IO.writeLine("" + Math.random());
            }
        }
};
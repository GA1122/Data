class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticTrue)
            {
                /* FLAW: Math.random() is a known weak PRNG */
                IO.writeLine("" + Math.random());
            }
        }
};
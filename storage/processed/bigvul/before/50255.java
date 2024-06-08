class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
            }
        }
};
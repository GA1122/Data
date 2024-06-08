class bad_class{
    public void bad() throws Throwable
        {
            if (true)
            {
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
            }
        }
};
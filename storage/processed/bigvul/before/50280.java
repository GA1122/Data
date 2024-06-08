class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
            }
        }
};
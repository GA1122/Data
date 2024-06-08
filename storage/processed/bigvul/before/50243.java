class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
            }
        }
};
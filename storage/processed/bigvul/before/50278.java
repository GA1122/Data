class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
                break;
            }
        }
};
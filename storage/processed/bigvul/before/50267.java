class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
            }
            else
            {
    
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
    
                IO.writeLine("" + secureRandom.nextDouble());
    
            }
        }
};
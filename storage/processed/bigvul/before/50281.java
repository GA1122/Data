class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
                IO.writeLine("" + secureRandom.nextDouble());
            }
        }
};
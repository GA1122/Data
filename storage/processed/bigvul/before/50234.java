class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
                IO.writeLine("" + secureRandom.nextDouble());
                break;
            }
        }
};
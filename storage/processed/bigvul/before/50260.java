class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
                IO.writeLine("" + secureRandom.nextDouble());
            }
        }
};
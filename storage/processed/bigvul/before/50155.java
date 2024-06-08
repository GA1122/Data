class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                SecureRandom secureRandom = new SecureRandom();
                /* FIX: no explicit seed specified; produces far less predictable PRNG sequence */
                IO.writeLine("" + secureRandom.nextInt());
                IO.writeLine("" + secureRandom.nextInt());
            }
        }
};
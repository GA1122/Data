class good2_class{
    private void good2() throws Throwable
        {
            if (privateFive == 5)
            {
                SecureRandom secureRandom = new SecureRandom();
                /* FIX: no explicit seed specified; produces far less predictable PRNG sequence */
                IO.writeLine("" + secureRandom.nextInt());
                IO.writeLine("" + secureRandom.nextInt());
            }
        }
};
class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                SecureRandom secureRandom = new SecureRandom();
                /* FIX: no explicit seed specified; produces far less predictable PRNG sequence */
                IO.writeLine("" + secureRandom.nextInt());
                IO.writeLine("" + secureRandom.nextInt());
            }
        }
};
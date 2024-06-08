class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
                SecureRandom secureRandom = new SecureRandom();
                /* FLAW: using the same seed can make the PRNG sequence predictable if the seed is known */
                secureRandom.setSeed(SEED);
                IO.writeLine("" + secureRandom.nextInt()); /* run this several times and notice that the bad values are always the same */
                IO.writeLine("" + secureRandom.nextInt());
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
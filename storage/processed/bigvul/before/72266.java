class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                SecureRandom secureRandom = new SecureRandom();
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FIX: Use a sufficiently random salt */
                SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
                hash.update(prng.generateSeed(32));
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
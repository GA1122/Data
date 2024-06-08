class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FIX: Use a sufficiently random salt */
                SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
                hash.update(prng.generateSeed(32));
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
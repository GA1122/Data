class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FLAW: SHA512 with no salt */
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
            }
            else
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
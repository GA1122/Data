class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FIX: Use a sufficiently random salt */
                SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
                hash.update(prng.generateSeed(32));
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
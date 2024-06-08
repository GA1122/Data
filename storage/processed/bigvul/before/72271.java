class good1_class{
    private void good1() throws Throwable
        {
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                SecureRandom secureRandom = new SecureRandom();
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FIX: Use a sufficiently random salt */
                SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
                hash.update(prng.generateSeed(32));
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
                break;
            }
        }
};
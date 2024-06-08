class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FLAW: SHA512 with no salt */
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
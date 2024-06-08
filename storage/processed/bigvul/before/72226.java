class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FLAW: SHA512 with no salt */
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
                break;
            }
        }
};
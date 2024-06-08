class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                String input = "Test Input";
                /* FLAW: Insecure cryptographic hashing algorithm (SHA1) */
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
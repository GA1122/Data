class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                String input = "Test Input";
                /* FLAW: Insecure cryptographic hashing algorithm (MD5) */
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
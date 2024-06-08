class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                String input = "Test Input";
                /* FLAW: Insecure cryptographic hashing algorithm (MD2) */
                MessageDigest messageDigest = MessageDigest.getInstance("MD2");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
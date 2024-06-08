class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                String input = "Test Input";
                /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
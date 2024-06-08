class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                String input = "Test Input";
                /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
            }
            else
            {
    
                String input = "Test Input";
    
                /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
    
                IO.writeLine(IO.toHex(hashValue));
    
            }
        }
};
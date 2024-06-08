class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                /* FLAW: Missing call to MessageDigest.update().  This will result in the hash being of no data */
                IO.writeLine(IO.toHex(messageDigest.digest()));
            }
            else
            {
    
                final String HASH_INPUT = "ABCDEFG123456";
    
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
    
                /* FIX: Include call to MessageDigest.update() */
                messageDigest.update(HASH_INPUT.getBytes("UTF-8"));
    
                IO.writeLine(IO.toHex(messageDigest.digest()));
    
            }
        }
};
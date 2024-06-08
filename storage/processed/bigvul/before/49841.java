class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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
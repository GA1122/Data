class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                final String HASH_INPUT = "ABCDEFG123456";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                /* FIX: Include call to MessageDigest.update() */
                messageDigest.update(HASH_INPUT.getBytes("UTF-8"));
                IO.writeLine(IO.toHex(messageDigest.digest()));
                break;
            }
        }
};
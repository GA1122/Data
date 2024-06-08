class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticFive == 5)
            {
                final String HASH_INPUT = "ABCDEFG123456";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                /* FIX: Include call to MessageDigest.update() */
                messageDigest.update(HASH_INPUT.getBytes("UTF-8"));
                IO.writeLine(IO.toHex(messageDigest.digest()));
            }
        }
};
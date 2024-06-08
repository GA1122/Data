class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                /* FLAW: Missing call to MessageDigest.update().  This will result in the hash being of no data */
                IO.writeLine(IO.toHex(messageDigest.digest()));
            }
        }
};
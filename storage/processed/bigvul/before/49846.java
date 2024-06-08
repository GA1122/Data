class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                /* FLAW: Missing call to MessageDigest.update().  This will result in the hash being of no data */
                IO.writeLine(IO.toHex(messageDigest.digest()));
            }
        }
};
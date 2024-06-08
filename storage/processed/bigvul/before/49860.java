class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                /* FLAW: Missing call to MessageDigest.update().  This will result in the hash being of no data */
                IO.writeLine(IO.toHex(messageDigest.digest()));
                break;
            }
        }
};
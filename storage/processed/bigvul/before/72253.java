class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                Random random = new Random();
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FLAW: SHA512 with a predictable salt */
                hash.update((Integer.toString(random.nextInt())).getBytes("UTF-8"));
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
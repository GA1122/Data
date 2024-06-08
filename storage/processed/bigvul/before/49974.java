class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                String input = "Test Input";
                /* FIX: Secure cryptographic hashing algorithm (SHA-512) */
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
            }
        }
};
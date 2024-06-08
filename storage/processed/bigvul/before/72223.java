class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FLAW: SHA512 with no salt */
                byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
                IO.writeLine(IO.toHex(hashValue));
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
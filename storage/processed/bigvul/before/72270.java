class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                Random random = new Random();
                MessageDigest hash = MessageDigest.getInstance("SHA-512");
                /* FLAW: SHA512 with a predictable salt */
                hash.update((Integer.toString(random.nextInt())).getBytes("UTF-8"));
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
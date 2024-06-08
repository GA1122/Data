class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                String input = "Test Input";
                /* FLAW: Insecure cryptographic hashing algorithm (MD2) */
                MessageDigest messageDigest = MessageDigest.getInstance("MD2");
                byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); /* INCIDENTAL FLAW: Hard-coded input to hash algorithm */
                IO.writeLine(IO.toHex(hashValue));
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
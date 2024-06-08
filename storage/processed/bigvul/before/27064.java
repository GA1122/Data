class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
                SecureRandom secureRandom = new SecureRandom();
                data = secureRandom.nextFloat();
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
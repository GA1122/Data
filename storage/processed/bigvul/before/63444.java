class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Set count to a random value */
                count = (new SecureRandom()).nextInt();
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
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
                int i = 0;
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
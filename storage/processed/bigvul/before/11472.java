class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
    
            switch (6)
            {
            case 6:
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            }
    
            switch (7)
            {
            case 7:
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
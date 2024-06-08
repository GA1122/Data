class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            float data;
    
            switch (6)
            {
            case 6:
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
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
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
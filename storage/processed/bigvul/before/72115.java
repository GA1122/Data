class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
    
            switch (5)
            {
            case 6:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            default:
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
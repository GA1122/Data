class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                try
                {
                    Integer.parseInt("Test"); /* Will throw NumberFormatException */
                }
                catch (Exception exception) /* FLAW: Catch Exception, which is overly generic */
                {
                    IO.writeLine("Caught Exception");
                    throw exception; /* Rethrow */
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
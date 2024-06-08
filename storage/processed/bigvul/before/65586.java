class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (IO.STATIC_FINAL_FIVE==5)
            {
                /* FIX: hardcode data to non-null */
                data = "This is not null";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
        }
};
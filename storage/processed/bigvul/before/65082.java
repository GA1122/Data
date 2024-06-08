class bad_class{
    public void bad() throws Throwable
        {
            Integer data;
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: data is null */
                data = null;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.toString());
            }
        }
};
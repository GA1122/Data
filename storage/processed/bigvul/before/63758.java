class goodG2BSink_class{
    public void goodG2BSink(int count ) throws Throwable
        {
            if (CWE400_Resource_Exhaustion__URLConnection_for_loop_22a.goodG2BPublicStatic)
            {
                int i = 0;
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
            }
        }
};
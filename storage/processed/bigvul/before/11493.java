class badSink_class{
    public void badSink(String data ) throws Throwable
        {
            if (CWE134_Uncontrolled_Format_String__Environment_printf_22a.badPublicStatic)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};
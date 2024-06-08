class goodG2BSink_class{
    public void goodG2BSink(float data ) throws Throwable
        {
            if (CWE369_Divide_by_Zero__float_console_readLine_modulo_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
        }
};
class goodG2BSink_class{
    public void goodG2BSink(int data ) throws Throwable
        {
            if (CWE369_Divide_by_Zero__int_File_modulo_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
                result in an exception.  */
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};
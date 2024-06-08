class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                testcases.CWE486_Compare_Classes_by_Name.HelperClass.CWE486_Compare_Classes_by_Name__Helper helperClass = new testcases.CWE486_Compare_Classes_by_Name.HelperClass.CWE486_Compare_Classes_by_Name__Helper();
                testcases.CWE486_Compare_Classes_by_Name.CWE486_Compare_Classes_by_Name__Helper helperClassRoot = new testcases.CWE486_Compare_Classes_by_Name.CWE486_Compare_Classes_by_Name__Helper();
                /* FIX: Compare the class types and not the names */
                if (helperClassRoot.getClass().equals(helperClass.getClass()))
                {
                    /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                    IO.writeLine("Classes are the same");
                }
                else
                {
                    IO.writeLine("Classes are different");
                }
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FLAW: Differentiating by name is not enough, since different classes in different packages may use the same name */
                testcases.CWE486_Compare_Classes_by_Name.HelperClass.CWE486_Compare_Classes_by_Name__Helper helperClass = new testcases.CWE486_Compare_Classes_by_Name.HelperClass.CWE486_Compare_Classes_by_Name__Helper();
                testcases.CWE486_Compare_Classes_by_Name.CWE486_Compare_Classes_by_Name__Helper helperClassRoot = new testcases.CWE486_Compare_Classes_by_Name.CWE486_Compare_Classes_by_Name__Helper();
                if (helperClassRoot.getClass().getSimpleName().equals(helperClass.getClass().getSimpleName()))
                {
                    IO.writeLine("Classes are the same");
                }
                else
                {
                    /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                    IO.writeLine("Classes are different");
                }
            }
        }
};
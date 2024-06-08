class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                File newDirectory = null;
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    /* running on Windows */
                    newDirectory = new File("C:\\lvl_1\\lvl_2\\lvl_3\\");
                }
                else
                {
                    /* running on non-Windows */
                    newDirectory = new File("/home/user/lvl_1/lvl_2/lvl_3/");
                }
                if (!newDirectory.mkdirs())
                {
                    /* FLAW: do nothing if newDirectory cannot be created */
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
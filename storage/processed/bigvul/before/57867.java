class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticFive == 5)
            {
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
            }
        }
};
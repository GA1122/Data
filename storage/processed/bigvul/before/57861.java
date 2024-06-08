class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticReturnsTrue())
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
                    /* FIX: report the mkdirs failure and throw a new Exception */
                    IO.writeLine("The directories could not be created");
                    StringBuilder errorString = new StringBuilder();
                    errorString.append("The directories (");
                    errorString.append(newDirectory.getAbsolutePath());
                    errorString.append(") could not be created: ");
                    throw new Exception(errorString.toString());
                }
            }
        }
};
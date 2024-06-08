class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                String root;
                String libraryName = "test.dll";
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    /* running on Windows */
                    root = "C:\\libs\\";
                }
                else
                {
                    /* running on non-Windows */
                    root = "/home/user/libs/";
                }
                /* FIX: Use System.load() which allows you to specify a full path to the library */
                System.load(root + libraryName);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
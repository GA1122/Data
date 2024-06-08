class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                String libraryName = "test.dll";
                /* FLAW: Attempt to load a library with System.loadLibrary() without
                 * the full path to the library. */
                System.loadLibrary(libraryName);
                break;
            }
        }
};
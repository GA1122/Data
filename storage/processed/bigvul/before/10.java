class bad_class{
    public void bad() throws Throwable
        {
            if (privateTrue)
            {
                String libraryName = "test.dll";
                /* FLAW: Attempt to load a library with System.loadLibrary() without
                 * the full path to the library. */
                System.loadLibrary(libraryName);
            }
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use a hardcoded string */
                data = "foo";
            }
            else
            {
    
                /* FIX: Use a hardcoded string */
                data = "foo";
    
            }
    
            String osCommand;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                /* running on Windows */
                osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
            }
            else
            {
                /* running on non-Windows */
                osCommand = "/bin/ls ";
            }
    
            /* POTENTIAL FLAW: command injection */
            Process process = Runtime.getRuntime().exec(osCommand + data);
            process.waitFor();
    
        }
};
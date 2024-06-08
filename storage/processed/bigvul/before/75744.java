class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
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
        }
};
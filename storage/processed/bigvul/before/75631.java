class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            badPublicStatic = true;
            data = (new CWE78_OS_Command_Injection__PropertiesFile_22b()).badSource();
    
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
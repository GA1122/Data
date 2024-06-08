class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
    
            goodG2B1PublicStatic = false;
            data = (new CWE78_OS_Command_Injection__database_22b()).goodG2B1Source();
    
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
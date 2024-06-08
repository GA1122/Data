class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                Calendar calendarNow = Calendar.getInstance();
                Calendar calendarCheck = Calendar.getInstance();
                calendarCheck.set(2020, 1, 1);
                /* FLAW: date triggered backdoor */
                if (calendarNow.after(calendarCheck))
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
            }
            else
            {
    
                Calendar calendarNow = Calendar.getInstance();
    
                Calendar calendarCheck = Calendar.getInstance();
                calendarCheck.set(2020, 1, 1);
    
                /* FIX: no backdoor exists */
                if (calendarNow.after(calendarCheck))
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
    
            }
        }
};
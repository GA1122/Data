class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
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
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                Calendar calendarNow = Calendar.getInstance();
                Calendar calendarCheck = Calendar.getInstance();
                calendarCheck.set(2020, 1, 1);
                /* FLAW: date triggered backdoor */
                if (calendarNow.after(calendarCheck))
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
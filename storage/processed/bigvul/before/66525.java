class good1_class{
    private void good1() throws Throwable
        {
            if (privateFalse)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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
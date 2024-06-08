class good1_class{
    private void good1() throws Throwable
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
};
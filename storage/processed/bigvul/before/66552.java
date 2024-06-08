class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticFive == 5)
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
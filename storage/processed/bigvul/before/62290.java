class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count = (new CWE400_Resource_Exhaustion__sleep_console_readLine_61b()).goodB2GSource();
    
            /* FIX: Validate count before using it in a call to Thread.sleep() */
            if (count > 0 && count <= 2000)
            {
                Thread.sleep(count);
            }
    
        }
};
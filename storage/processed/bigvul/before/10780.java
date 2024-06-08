class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = goodB2GSource();
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.printf("%s%n", data);
            }
    
        }
};
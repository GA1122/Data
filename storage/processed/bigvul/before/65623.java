class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = goodB2GSource();
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};
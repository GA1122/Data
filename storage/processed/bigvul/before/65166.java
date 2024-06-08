class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            Integer data = goodB2GSource();
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};
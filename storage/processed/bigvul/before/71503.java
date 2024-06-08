class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = goodB2GSource();
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
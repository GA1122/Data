class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data = goodB2GSource();
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
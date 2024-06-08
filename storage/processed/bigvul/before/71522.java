class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
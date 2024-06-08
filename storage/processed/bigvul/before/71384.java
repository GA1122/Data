class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            StringBuilder data = (StringBuilder)dataObject;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
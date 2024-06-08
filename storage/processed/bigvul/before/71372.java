class goodB2GSink_class{
    public void goodB2GSink(StringBuilder data ) throws Throwable
        {
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
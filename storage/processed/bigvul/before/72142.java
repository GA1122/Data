class goodB2GSink_class{
    private void goodB2GSink(String data ) throws Throwable
        {
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
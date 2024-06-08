class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            String data = dataGoodB2G;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
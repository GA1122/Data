class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            StringBuilder data = dataGoodB2G;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
class goodB2GSink_class{
    public void goodB2GSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
class goodB2GSink_class{
    public void goodB2GSink(StringBuilder dataArray[] ) throws Throwable
        {
            StringBuilder data = dataArray[2];
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
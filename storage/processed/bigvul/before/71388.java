class goodB2GSink_class{
    public void goodB2GSink(Vector<StringBuilder> dataVector ) throws Throwable
        {
            StringBuilder data = dataVector.remove(2);
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
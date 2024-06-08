class goodB2GSink_class{
    public void goodB2GSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};
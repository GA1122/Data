class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
            }
            else
            {
    
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
            }
            else
            {
    
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
    
            }
        }
};
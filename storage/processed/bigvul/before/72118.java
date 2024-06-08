class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
                break;
            }
    
            while (true)
            {
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
                break;
            }
        }
};
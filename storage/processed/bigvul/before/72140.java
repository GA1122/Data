class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
    
            }
        }
};
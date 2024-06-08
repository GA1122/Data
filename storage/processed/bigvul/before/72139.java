class bad_class{
    public void bad() throws Throwable
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
    
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
    
                IO.writeLine(stringTrimmed);
    
            }
        }
};
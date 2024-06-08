class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();
    
            IO.writeLine(stringTrimmed);
    
        }
};
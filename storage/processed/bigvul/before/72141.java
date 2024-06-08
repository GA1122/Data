class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
    
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
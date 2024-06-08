class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
                break;
            }
    
        }
};
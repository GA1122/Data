class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* FIX: Use a hardcoded string */
                data = "foo";
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
    
            }
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* FIX: Use a hardcoded string */
                data = "foo";
                break;
            }
    
            while (true)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
                break;
            }
    
        }
};
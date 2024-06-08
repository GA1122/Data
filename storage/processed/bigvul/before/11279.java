class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use a hardcoded string */
                data = "foo";
            }
            else
            {
    
                /* FIX: Use a hardcoded string */
                data = "foo";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
                }
            }
            else
            {
    
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
                }
    
            }
        }
};
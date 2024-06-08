class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            float data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
            else
            {
    
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
    
            }
        }
};
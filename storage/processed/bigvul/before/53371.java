class bad_class{
    public void bad() throws Throwable
        {
            float data;
            if(IO.staticReturnsTrueOrFalse())
            {
                data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
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
    
                /* FIX: Check for value of or near zero before dividing */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 / data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
    
            }
        }
};
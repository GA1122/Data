class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            float data;
    
            /* FIX: Use a hardcoded number that won't a divide by zero */
            data = 2.0f;
    
            /* POTENTIAL FLAW: Possibly modulo by zero */
            int result = (int)(100.0 % data);
            IO.writeLine(result);
    
        }
};
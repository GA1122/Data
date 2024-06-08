class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            while (true)
            {
                data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
                break;
            }
        }
};
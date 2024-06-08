class bad_class{
    public void bad() throws Throwable
        {
            float dataCopy;
            {
                float data;
    
                data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
                dataCopy = data;
            }
            {
                float data = dataCopy;
    
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
    
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
            }
        }
};
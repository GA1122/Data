class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = "Reinitialize";
                IO.writeLine(data);
            }
        }
};
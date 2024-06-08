class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
        }
};
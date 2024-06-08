class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                data++;
                byte result = (byte)(data);
                IO.writeLine("result: " + result);
            }
        }
};
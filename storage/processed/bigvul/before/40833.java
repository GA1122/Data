class bad_class{
    public void bad() throws Throwable
        {
            long dataCopy;
            {
                long data;
    
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
    
                dataCopy = data;
            }
            {
                long data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(data - 1);
    
                IO.writeLine("result: " + result);
    
            }
        }
};
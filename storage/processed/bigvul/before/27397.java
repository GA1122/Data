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
    
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                data++;
                long result = (long)(data);
    
                IO.writeLine("result: " + result);
    
            }
        }
};
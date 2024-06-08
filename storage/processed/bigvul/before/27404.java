class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            dataBad = data;
            badSink();
        }
};
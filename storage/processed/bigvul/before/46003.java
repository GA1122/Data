class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Set data to a random value */
            data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
            dataBad = data;
            badSink();
        }
};
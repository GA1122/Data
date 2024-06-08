class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            long result = (long)(--data);
    
            IO.writeLine("result: " + result);
    
        }
};
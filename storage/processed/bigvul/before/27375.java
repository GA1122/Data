class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                data++;
                long result = (long)(data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};
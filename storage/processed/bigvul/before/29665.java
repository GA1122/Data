class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
                data++;
                short result = (short)(data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};
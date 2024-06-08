class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            /* POTENTIAL FLAW: if (data*data) > Byte.MAX_VALUE, this will overflow */
            byte result = (byte)(data * data);
    
            IO.writeLine("result: " + result);
    
        }
};
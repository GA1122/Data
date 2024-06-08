class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Math.random() is a known weak PRNG */
                IO.writeLine("" + Math.random());
            }
            else
            {
    
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
    
                IO.writeLine("" + secureRandom.nextDouble());
    
            }
        }
};
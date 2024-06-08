class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
                IO.writeLine("" + secureRandom.nextDouble());
            }
            else
            {
    
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
    
                IO.writeLine("" + secureRandom.nextDouble());
    
            }
        }
};
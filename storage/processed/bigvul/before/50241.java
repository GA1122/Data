class good1_class{
    private void good1() throws Throwable
        {
            if (5 != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: java.security.SecureRandom is considered to be a strong PRNG */
                SecureRandom secureRandom = new SecureRandom();
    
                IO.writeLine("" + secureRandom.nextDouble());
    
            }
        }
};
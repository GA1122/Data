class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                SecureRandom secureRandom = new SecureRandom();
                /* FIX: no explicit seed specified; produces far less predictable PRNG sequence */
                IO.writeLine("" + secureRandom.nextInt());
                IO.writeLine("" + secureRandom.nextInt());
            }
            else
            {
    
                SecureRandom secureRandom = new SecureRandom();
    
                /* FIX: no explicit seed specified; produces far less predictable PRNG sequence */
    
                IO.writeLine("" + secureRandom.nextInt());
                IO.writeLine("" + secureRandom.nextInt());
    
            }
        }
};
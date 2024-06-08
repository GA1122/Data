class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticFive != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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
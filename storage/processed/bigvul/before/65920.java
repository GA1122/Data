class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                int zeroOrOne = (new SecureRandom()).nextInt(2);
    
                boolean isZero = false;
    
                if((isZero = (zeroOrOne == 0)) == true) /* FIX: correct assignment */
                {
                    IO.writeLine("zeroOrOne is 0");
                }
    
                IO.writeLine("isZero is: " + isZero);
    
            }
        }
};
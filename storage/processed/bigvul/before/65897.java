class good1_class{
    private void good1() throws Throwable
        {
    
            int zeroOrOne = (new SecureRandom()).nextInt(2);
    
            boolean isZero = false;
    
            if((isZero = (zeroOrOne == 0)) == true) /* FIX: correct assignment */
            {
                IO.writeLine("zeroOrOne is 0");
            }
    
            IO.writeLine("isZero is: " + isZero);
    
        }
};
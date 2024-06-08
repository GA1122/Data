class bad_class{
    public void bad() throws Throwable
        {
            int x, y;
    
            x = (new SecureRandom()).nextInt(3);
            y = 0;
    
            /* FLAW: forgot to put these two statements within braces
             * (on the same line) */
            if (x == 0) IO.writeLine("x == 0"); y = 1;
    
            if (y == 1) 
            {
                IO.writeLine("x was 0");
            }
        }
};
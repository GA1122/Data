class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int[] intArray = new int[10];
                int i = 0;
                /* FLAW: Use <= rather than < */
                while (i <= intArray.length)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                    i++;
                }
            }
            else
            {
    
                int[] intArray = new int[10];
                int i = 0;
    
                /* FIX: Use < to ensure no out of bounds access */
                while (i < intArray.length)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                    i++;
                }
    
            }
        }
};
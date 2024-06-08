class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int[] intArray = new int[10];
                /* FIX: Use < to ensure no out of bounds access */
                for (int i = 0; i < intArray.length; i++)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                }
            }
            else
            {
    
                int[] intArray = new int[10];
    
                /* FIX: Use < to ensure no out of bounds access */
                for (int i = 0; i < intArray.length; i++)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                }
    
            }
        }
};
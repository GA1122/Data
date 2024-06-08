class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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
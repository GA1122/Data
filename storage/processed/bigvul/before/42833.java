class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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
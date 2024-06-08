class good2_class{
    private void good2() throws Throwable
        {
            if (privateFive == 5)
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
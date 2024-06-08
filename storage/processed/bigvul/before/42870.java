class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
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
class good2_class{
    private void good2() throws Throwable
        {
            if (true)
            {
                int[] intArray = new int[10];
                int i = 0;
                do
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                    i++;
                }
                while (i < intArray.length);   /* FIX: Use < to ensure no out of bounds access */
            }
        }
};
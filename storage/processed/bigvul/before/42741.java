class good1_class{
    private void good1() throws Throwable
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
};
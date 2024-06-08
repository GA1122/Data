class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
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
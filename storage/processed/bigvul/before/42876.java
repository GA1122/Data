class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                int[] intArray = new int[10];
                int i = 0;
                /* FIX: Use < to ensure no out of bounds access */
                while (i < intArray.length)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                    i++;
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
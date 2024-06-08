class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                int[] intArray = new int[10];
                /* FLAW: index outside of array, off by one */
                for (int i = 0; i <= intArray.length; i++)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                }
            }
        }
};
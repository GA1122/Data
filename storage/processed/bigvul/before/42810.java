class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
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
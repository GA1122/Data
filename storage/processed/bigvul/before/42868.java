class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                int[] intArray = new int[10];
                int i = 0;
                /* FLAW: Use <= rather than < */
                while (i <= intArray.length)
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                    i++;
                }
            }
        }
};
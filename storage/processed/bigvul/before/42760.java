class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                int[] intArray = new int[10];
                int i = 0;
                do
                {
                    IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                    i++;
                }
                while (i <= intArray.length);   /* FLAW: Use <= rather than < */
            }
        }
};
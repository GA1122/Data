class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            for (int j = 0; j < 1; j++)
            {
                /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
                int array[] = { 0, 1, 2, 3, 4 };
                /* POTENTIAL FLAW: Verify that data < array.length, but don't verify that data > 0, so may be attempting to read out of the array bounds */
                if (data < array.length)
                {
                    IO.writeLine(array[data]);
                }
                else
                {
                    IO.writeLine("Array index out of bounds");
                }
            }
        }
};
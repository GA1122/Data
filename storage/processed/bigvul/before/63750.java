class goodG2BSink_class{
    private void goodG2BSink(int count ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                int i = 0;
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
            }
        }
};
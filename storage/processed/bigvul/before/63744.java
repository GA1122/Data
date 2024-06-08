class badSink_class{
    private void badSink(int count ) throws Throwable
        {
            if (badPrivate)
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
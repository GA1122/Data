class goodG2BSink_class{
    private void goodG2BSink(int data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};
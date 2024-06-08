class goodG2BSink_class{
    private void goodG2BSink(int data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
        }
};
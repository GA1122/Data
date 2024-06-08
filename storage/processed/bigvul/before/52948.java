class goodG2BSink_class{
    private void goodG2BSink(float data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
            }
        }
};
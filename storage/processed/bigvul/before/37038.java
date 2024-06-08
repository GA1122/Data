class goodG2BSink_class{
    public void goodG2BSink(int data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__int_PropertiesFile_sub_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};
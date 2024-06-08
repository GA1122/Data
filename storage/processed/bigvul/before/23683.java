class badSink_class{
    public void badSink(int data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__int_Property_preinc_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
                int result = (int)(++data);
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
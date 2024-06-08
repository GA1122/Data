class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
                data++;
                int result = (int)(data);
                IO.writeLine("result: " + result);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
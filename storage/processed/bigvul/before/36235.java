class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(--data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};
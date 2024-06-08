class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
    
                IO.writeLine("result: " + result);
    
            }
        }
};
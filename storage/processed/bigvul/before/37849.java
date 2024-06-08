class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
    
            }
        }
};
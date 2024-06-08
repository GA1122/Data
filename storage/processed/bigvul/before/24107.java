class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
                break;
            }
    
            while (true)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            }
        }
};
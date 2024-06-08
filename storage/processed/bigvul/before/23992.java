class goodB2G_class{
    private void goodB2G() throws Throwable
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
    
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Integer.MAX_VALUE)
                {
                    int result = (int)(data + 1);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform addition.");
                }
    
            }
        }
};
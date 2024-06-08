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
    
                /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
                int result = (int)(data + 1);
    
                IO.writeLine("result: " + result);
    
            }
        }
};
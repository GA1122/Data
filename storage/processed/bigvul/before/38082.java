class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            int result = (int)(--data);
    
            IO.writeLine("result: " + result);
    
        }
};
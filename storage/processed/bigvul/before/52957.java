class bad_class{
    public void bad() throws Throwable
        {
            float dataCopy;
            {
                float data;
    
                /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
                SecureRandom secureRandom = new SecureRandom();
                data = secureRandom.nextFloat();
    
                dataCopy = data;
            }
            {
                float data = dataCopy;
    
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
    
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
                SecureRandom secureRandom = new SecureRandom();
                data = secureRandom.nextFloat();
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
                break;
            }
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE191_Integer_Underflow__short_rand_sub_66b()).badSink(dataArray  );
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            long[] dataArray = new long[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__long_rand_multiply_66b()).badSink(dataArray  );
        }
};
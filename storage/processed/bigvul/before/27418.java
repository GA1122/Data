class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            long[] dataArray = new long[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__long_rand_postinc_66b()).goodB2GSink(dataArray  );
        }
};
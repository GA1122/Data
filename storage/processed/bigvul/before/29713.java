class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE190_Integer_Overflow__short_rand_postinc_67b()).badSink(dataContainer  );
        }
};
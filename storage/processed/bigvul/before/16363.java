class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE190_Integer_Overflow__byte_rand_postinc_67b()).badSink(dataContainer  );
        }
};
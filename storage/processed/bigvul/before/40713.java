class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE191_Integer_Underflow__long_rand_predec_67b()).badSink(dataContainer  );
        }
};
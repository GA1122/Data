class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__int_random_sub_22b()).badSink(data );
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__int_random_square_22b()).badSink(data );
        }
};
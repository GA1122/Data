class bad_class{
    public void bad() throws Throwable
        {
            int count = 0;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            badPublicStatic = true;
            (new CWE400_Resource_Exhaustion__random_write_22b()).badSink(count );
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            badPublicStatic = true;
            (new CWE369_Divide_by_Zero__int_random_divide_22b()).badSink(data );
        }
};
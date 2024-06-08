class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE191_Integer_Underflow__int_random_multiply_81_base baseObject = new CWE191_Integer_Underflow__int_random_multiply_81_goodB2G();
            baseObject.action(data );
        }
};
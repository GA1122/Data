class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE190_Integer_Overflow__int_random_preinc_81_base baseObject = new CWE190_Integer_Overflow__int_random_preinc_81_goodB2G();
            baseObject.action(data );
        }
};
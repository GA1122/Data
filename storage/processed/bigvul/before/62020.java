class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            CWE400_Resource_Exhaustion__random_write_81_base baseObject = new CWE400_Resource_Exhaustion__random_write_81_goodB2G();
            baseObject.action(count );
        }
};
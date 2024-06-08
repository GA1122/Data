class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE789_Uncontrolled_Mem_Alloc__random_ArrayList_81_base baseObject = new CWE789_Uncontrolled_Mem_Alloc__random_ArrayList_81_bad();
            baseObject.action(data );
        }
};
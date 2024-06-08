class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded value */
            data = "23 ~j;asn!@#/>as";
    
            CWE321_Hard_Coded_Cryptographic_Key__basic_81_base baseObject = new CWE321_Hard_Coded_Cryptographic_Key__basic_81_bad();
            baseObject.action(data );
        }
};
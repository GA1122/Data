class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded value */
            data = "23 ~j;asn!@#/>as";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE321_Hard_Coded_Cryptographic_Key__basic_66b()).badSink(dataArray  );
        }
};
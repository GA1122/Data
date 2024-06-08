class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded value */
            data = "23 ~j;asn!@#/>as";
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE321_Hard_Coded_Cryptographic_Key__basic_72b()).badSink(dataVector  );
        }
};
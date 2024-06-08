class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded value */
            data = "23 ~j;asn!@#/>as";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE321_Hard_Coded_Cryptographic_Key__basic_67b()).badSink(dataContainer  );
        }
};
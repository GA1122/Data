class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE89_SQL_Injection__listen_tcp_executeUpdate_72b()).goodG2BSink(dataVector  );
        }
};
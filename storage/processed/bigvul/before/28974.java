class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE190_Integer_Overflow__short_max_postinc_67b()).goodB2GSink(dataContainer  );
        }
};
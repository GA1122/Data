class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            Vector<Long> dataVector = new Vector<Long>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE190_Integer_Overflow__long_max_postinc_72b()).badSink(dataVector  );
        }
};
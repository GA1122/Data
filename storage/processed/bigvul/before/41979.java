class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            Vector<Short> dataVector = new Vector<Short>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE191_Integer_Underflow__short_min_predec_72b()).badSink(dataVector  );
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE190_Integer_Overflow__short_max_square_67b()).badSink(dataContainer  );
        }
};
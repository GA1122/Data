class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE191_Integer_Underflow__long_min_sub_67b()).badSink(dataContainer  );
        }
};
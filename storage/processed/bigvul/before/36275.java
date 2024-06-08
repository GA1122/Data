class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE191_Integer_Underflow__int_min_predec_67b()).badSink(dataContainer  );
        }
};
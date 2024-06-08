class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            Container countContainer = new Container();
            countContainer.containerOne = count;
            (new CWE400_Resource_Exhaustion__sleep_max_value_67b()).badSink(countContainer  );
        }
};
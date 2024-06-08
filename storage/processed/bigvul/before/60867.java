class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            badPrivate = true;
            badSink(count );
        }
};
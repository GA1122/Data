class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            badPrivate = true;
            badSink(data );
        }
};
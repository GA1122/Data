class badSink_class{
    public void badSink(String data ) throws Throwable
        {
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
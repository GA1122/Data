class badSink_class{
    public void badSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
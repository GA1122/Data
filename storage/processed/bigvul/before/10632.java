class badSink_class{
    public void badSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
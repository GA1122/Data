class badSink_class{
    private void badSink() throws Throwable
        {
            String data = dataBad;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
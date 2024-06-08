class badSink_class{
    private void badSink(String data ) throws Throwable
        {
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
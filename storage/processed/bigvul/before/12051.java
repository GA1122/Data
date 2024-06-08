class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = goodG2BSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            String data = badSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
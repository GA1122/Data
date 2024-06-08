class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
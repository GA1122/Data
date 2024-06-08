class goodG2BSink_class{
    public void goodG2BSink(String data ) throws Throwable
        {
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            String data = dataGoodG2B;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};
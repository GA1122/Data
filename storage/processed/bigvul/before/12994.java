class goodG2BSink_class{
    public void goodG2BSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
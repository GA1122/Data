class goodG2BSink_class{
    public void goodG2BSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
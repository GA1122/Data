class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int [] dataCopy;
            {
                int [] data;
    
                /* FIX: hardcode data to non-null */
                data = new int[5];
    
                dataCopy = data;
            }
            {
                int [] data = dataCopy;
    
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length);
    
            }
        }
};
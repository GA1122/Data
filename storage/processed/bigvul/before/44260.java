class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,Integer> dataHashMap ) throws Throwable
        {
            int data = dataHashMap.get(2);
    
            {
                /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                IO.writeLine((short)data);
            }
    
        }
};
class badSink_class{
    public void badSink(HashMap<Integer,Integer> countHashMap ) throws Throwable
        {
            int count = countHashMap.get(2);
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};
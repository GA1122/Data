class badSink_class{
    public void badSink(HashMap<Integer,String> dataHashMap ) throws Throwable
        {
            String data = dataHashMap.get(2);
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
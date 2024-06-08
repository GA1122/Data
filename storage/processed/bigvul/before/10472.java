class badSink_class{
    public void badSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};
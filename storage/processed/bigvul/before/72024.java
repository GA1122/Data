class goodG2BSink_class{
    public void goodG2BSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};
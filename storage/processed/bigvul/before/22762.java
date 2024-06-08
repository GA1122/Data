class goodG2BSink_class{
    public void goodG2BSink(Vector<Integer> dataVector ) throws Throwable
        {
            int data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
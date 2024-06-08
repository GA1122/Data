class goodG2BSink_class{
    public void goodG2BSink(int dataArray[] ) throws Throwable
        {
            int data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
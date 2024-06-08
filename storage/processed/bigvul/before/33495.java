class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            int data = dataGoodG2B;
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            int data = badSource();
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};
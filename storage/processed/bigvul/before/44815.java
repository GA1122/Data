class bad_class{
    public void bad() throws Throwable
        {
            int data = badSource();
    
            {
                /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                IO.writeLine((short)data);
            }
    
        }
};
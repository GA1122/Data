class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            Container countContainer = new Container();
            countContainer.containerOne = count;
            (new CWE400_Resource_Exhaustion__random_write_67b()).badSink(countContainer  );
        }
};
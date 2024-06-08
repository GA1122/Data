class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE191_Integer_Underflow__int_random_sub_67b()).badSink(dataContainer  );
        }
};
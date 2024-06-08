class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE369_Divide_by_Zero__int_random_divide_67b()).badSink(dataContainer  );
        }
};
class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            int[] countArray = new int[5];
            countArray[2] = count;
            (new CWE400_Resource_Exhaustion__random_write_66b()).badSink(countArray  );
        }
};
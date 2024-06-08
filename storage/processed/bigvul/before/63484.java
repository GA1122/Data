class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            int[] countArray = new int[5];
            countArray[2] = count;
            (new CWE400_Resource_Exhaustion__sleep_random_66b()).goodB2GSink(countArray  );
        }
};
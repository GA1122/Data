class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            Vector<Integer> countVector = new Vector<Integer>(5);
            countVector.add(0, count);
            countVector.add(1, count);
            countVector.add(2, count);
            (new CWE400_Resource_Exhaustion__sleep_random_72b()).goodB2GSink(countVector  );
        }
};
class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            Container countContainer = new Container();
            countContainer.containerOne = count;
            (new CWE400_Resource_Exhaustion__sleep_random_67b()).goodB2GSink(countContainer  );
        }
};
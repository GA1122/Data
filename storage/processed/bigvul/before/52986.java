class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE369_Divide_by_Zero__float_random_modulo_67b()).goodB2GSink(dataContainer  );
        }
};
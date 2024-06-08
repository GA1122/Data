class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            Vector<Float> dataVector = new Vector<Float>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE369_Divide_by_Zero__float_random_modulo_72b()).goodB2GSink(dataVector  );
        }
};
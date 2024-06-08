class goodB2GSink_class{
    public void goodB2GSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.printf("%s%n", data);
            }
    
        }
};
class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* FIX: Use a hardcoded class name */
                data = "Testing.test";
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
                Class<?> tempClass = Class.forName(data);
                Object tempClassObject = tempClass.newInstance();
    
                IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
            }
        }
};
class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
    
            goodG2B1_private = false;
            data = goodG2B1_source();
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};
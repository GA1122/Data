class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
    
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
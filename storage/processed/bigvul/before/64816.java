class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            switch (6)
            {
            case 6:
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            }
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};
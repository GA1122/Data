class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            for (int i = 0; i < 1; i++)
            {
                /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
                Class<?> tempClass = Class.forName(data);
                Object tempClassObject = tempClass.newInstance();
                IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
            }
        }
};
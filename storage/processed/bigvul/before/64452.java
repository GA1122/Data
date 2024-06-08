class goodG2BSink_class{
    public void goodG2BSink(CWE470_Unsafe_Reflection__Environment_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};
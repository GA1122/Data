class badSink_class{
    public void badSink(LinkedList<String> passwordLinkedList ) throws Throwable
        {
            String password = passwordLinkedList.remove(2);
    
            if (password != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};
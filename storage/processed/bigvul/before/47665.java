class badSink_class{
    public void badSink(LinkedList<String> dataLinkedList ) throws Throwable
        {
            String data = dataLinkedList.remove(2);
    
            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};
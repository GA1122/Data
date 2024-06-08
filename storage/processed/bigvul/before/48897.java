class badSink_class{
    public void badSink(LinkedList<String> passwordLinkedList ) throws Throwable
        {
            String password = passwordLinkedList.remove(2);
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};
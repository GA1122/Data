class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                ArrayList<byte[]> byteArrayList = new ArrayList<byte[]>();
                /* INCIDENTAL: CWE 571: Expression is Always True */
                if(true) /* need this here so that the Java compiler does not error on code after the while(true) as unreachable code */
                {
                    while(true)
                    {
                        /* FIX: threshold defined for memory consumption */
                        if (Runtime.getRuntime().freeMemory() < 10485760)
                        {
                            IO.writeLine("Not enough memory to go again");
                            break;
                        }
                        /* consume memory in 10MB chunks */
                        byte[] byteArray = new byte[10485760];
                        byteArrayList.add(byteArray);
                        IO.writeLine("" + Runtime.getRuntime().freeMemory());
                    }
                }
                break;
            }
        }
};
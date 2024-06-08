class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
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
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
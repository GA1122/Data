class good1_class{
    private void good1() throws Throwable
        {
            if (privateFalse)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                String stringIntValue = "";
                int x = (new SecureRandom()).nextInt(3);
    
                switch (x)
                {
                case 0:
                    stringIntValue = "0";
                    break;
                case 1:
                    stringIntValue = "1";
                    break;
                    /* FIX: Add a default case */
                default:
                    stringIntValue = "2";
                }
    
                IO.writeLine(stringIntValue);
    
            }
        }
};
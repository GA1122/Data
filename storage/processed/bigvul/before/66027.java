class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int intRandom = (new SecureRandom()).nextInt(3);
                String stringValue;
                switch (intRandom)
                {
                case 1:
                    stringValue = "one";
                    break;
                case 2:
                    stringValue = "two";
                    break; /* FIX: Case 2 has a break statement */
                default:
                    stringValue = "Default";
                    break;
                }
                IO.writeLine(stringValue);
            }
            else
            {
    
                int intRandom = (new SecureRandom()).nextInt(3);
                String stringValue;
    
                switch (intRandom)
                {
                case 1:
                    stringValue = "one";
                    break;
                case 2:
                    stringValue = "two";
                    break; /* FIX: Case 2 has a break statement */
                default:
                    stringValue = "Default";
                    break;
                }
    
                IO.writeLine(stringValue);
    
            }
        }
};
class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
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
class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                int intRandom = (new SecureRandom()).nextInt(3);
                String stringValue;
                switch (intRandom)
                {
                case 1:
                    stringValue = "one";
                    break;
                case 2:
                    stringValue = "two"; /* INCIDENTAL: CWE563 Unused Variable (actually unused value) since s gets overwritten in the default case */
                    /* FLAW: Case 2 is missing a break statement */
                default:
                    stringValue = "Default";
                    break;
                }
                IO.writeLine(stringValue);
            }
        }
};
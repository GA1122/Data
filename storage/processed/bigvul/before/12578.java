class goodG2BSink_class{
    private void goodG2BSink(String data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
            }
        }
};
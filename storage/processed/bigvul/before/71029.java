class goodG2BSink_class{
    private void goodG2BSink(String data ) throws Throwable
        {
            if (goodG2BPrivate)
            {
                String xmlFile = null;
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    /* running on Windows */
                    xmlFile = "\\src\\testcases\\CWE643_Xpath Injection\\CWE643_Xpath_Injection__Helper.xml";
                }
                else
                {
                    /* running on non-Windows */
                    xmlFile = "./src/testcases/CWE643_Xpath Injection/CWE643_Xpath_Injection__Helper.xml";
                }
                if (data != null)
                {
                    /* assume username||password as source */
                    String [] tokens = data.split("||");
                    if (tokens.length < 2)
                    {
                        return;
                    }
                    String username = tokens[0];
                    String password = tokens[1];
                    /* build xpath */
                    XPath xPath = XPathFactory.newInstance().newXPath();
                    InputSource inputXml = new InputSource(xmlFile);
                    /* INCIDENTAL: CWE180 Incorrect Behavior Order: Validate Before Canonicalize
                     *     The user input should be canonicalized before validation. */
                    /* POTENTIAL FLAW: user input is used without validate */
                    String query = "//users/user[name/text()='" + username +
                    "' and pass/text()='" + password + "']" +
                    "/secret/text()";
                    String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
                }
            }
        }
};
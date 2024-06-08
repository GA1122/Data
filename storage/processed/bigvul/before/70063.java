class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
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
                    if( tokens.length < 2 )
                    {
                        return;
                    }
                    /* FIX: validate input using StringEscapeUtils */
                    String username = StringEscapeUtils.escapeXml(tokens[0]);
                    String password = StringEscapeUtils.escapeXml(tokens[1]);
                    /* build xpath */
                    XPath xPath = XPathFactory.newInstance().newXPath();
                    InputSource inputXml = new InputSource(xmlFile);
                    String query = "//users/user[name/text()='" + username +
                                   "' and pass/text()='" + password + "']" +
                                   "/secret/text()";
                    String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
                }
    
            }
        }
};
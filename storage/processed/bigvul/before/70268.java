class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
            if (IO.staticReturnsTrue())
            {
                data = ""; /* Initialize data */
                {
                    File file = new File("C:\\data.txt");
                    FileInputStream streamFileInput = null;
                    InputStreamReader readerInputStream = null;
                    BufferedReader readerBuffered = null;
                    try
                    {
                        /* read string from file into data */
                        streamFileInput = new FileInputStream(file);
                        readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data from a file */
                        /* This will be reading the first "line" of the file, which
                         * could be very long if there are little or no newlines in the file */
                        data = readerBuffered.readLine();
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
                        /* Close stream reading objects */
                        try
                        {
                            if (readerBuffered != null)
                            {
                                readerBuffered.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                        }
    
                        try
                        {
                            if (readerInputStream != null)
                            {
                                readerInputStream.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                        }
    
                        try
                        {
                            if (streamFileInput != null)
                            {
                                streamFileInput.close();
                            }
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                        }
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticReturnsFalse())
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
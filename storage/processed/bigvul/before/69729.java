class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                data = ""; /* Initialize data */
                {
                    InputStreamReader readerInputStream = null;
                    BufferedReader readerBuffered = null;
                    /* read user input from console with readLine */
                    try
                    {
                        readerInputStream = new InputStreamReader(System.in, "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
                        /* POTENTIAL FLAW: Read data from the console using readLine */
                        data = readerBuffered.readLine();
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
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
                    }
                }
                /* NOTE: Tools may report a flaw here because buffread and isr are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }
            else
            {
    
                data = ""; /* Initialize data */
    
                {
                    InputStreamReader readerInputStream = null;
                    BufferedReader readerBuffered = null;
    
                    /* read user input from console with readLine */
                    try
                    {
                        readerInputStream = new InputStreamReader(System.in, "UTF-8");
                        readerBuffered = new BufferedReader(readerInputStream);
    
                        /* POTENTIAL FLAW: Read data from the console using readLine */
                        data = readerBuffered.readLine();
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    }
                    finally
                    {
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
                    }
                }
                /* NOTE: Tools may report a flaw here because buffread and isr are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
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
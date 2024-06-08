class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                InputStream streamInput = null;
                try
                {
                    /* FLAW: direct usage of URI */
                    URL url = new URL("http://123.123.123.123:80");
                    streamInput = url.openStream();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "caught IOException", exceptIO);
                }
                finally
                {
                    try
                    {
                        if (streamInput != null)
                        {
                            streamInput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "caught IOException", exceptIO);
                    }
                }
            }
        }
};
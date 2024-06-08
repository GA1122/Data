class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* adapted from http://www.java-tips.org/java-se-tips/java.awt/how-to-capture-screenshot.html */
                try
                {
                    Robot robot = new Robot();
                    /* FLAW: Capture the screen shot of the area of the screen defined by the rectangle */
                    BufferedImage screenCapture = robot.createScreenCapture(new Rectangle(100,100));
                    ImageIO.write(screenCapture, "jpg", new File("C:/screen.jpg"));
                }
                catch (AWTException exceptAWT)
                {
                    IO.logger.log(Level.WARNING, "Could not access screen for capture", exceptAWT);
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Could not access file system", exceptIO);
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};
* Dependencies

    * Geckodriver 
        
        * (I placed my executable in `/usr/local/bin`), with this approach Selenium automatically finds it from your path.
        * Alternatively you can set it in the code like so: `System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");`
    
    * Set two environment variables for the email and password that you want to use to login.
    
        * In my case it was necessary to close my ide, then set the variables, and then open the project back up.

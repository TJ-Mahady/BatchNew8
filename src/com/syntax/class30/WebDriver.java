package com.syntax.class30;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver, TakeScreenshot {
    void navigate();
}
interface TakeScreenshot {
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Google Chrome Browser");
    }
    @Override
    public void open() {
        System.out.println(getTitle() + " can open Google Chrome Browser");
    }
    @Override
    public void close() {
        System.out.println(getTitle() + " can close Google Chrome Browser");
    }
    @Override
    public String getTitle() {
        String title = "Chrome Driver";
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println(getTitle() + " can open Firefox Browser");
    }
    @Override
    public void close() {
        System.out.println(getTitle() + " can close Firefox Browser");
    }
    @Override
    public String getTitle() {
        String title = "FireFox Driver";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Firefox Browser");
    }
    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }
}
class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Safari Browser");
    }
    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }
    @Override
    public void open() {
        System.out.println(getTitle() + " can open Safari Browser");
    }
    @Override
    public void close() {
        System.out.println(getTitle() + " can close Safari Browser");
    }
    @Override
    public String getTitle() {
        String title = "Safari Driver";
        return title;
    }
}
class WebDrivertester {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.getTitle();
        chrome.open();
        chrome.navigate();
        chrome.getScreenshot();
        chrome.close();
    }
}

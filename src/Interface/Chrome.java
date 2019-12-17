package Interface;



public class Chrome extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is closing");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("Chrome is going to:"+ url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("Chrome is opening a new tab:"+ url);
    }



}

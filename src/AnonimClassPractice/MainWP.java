package AnonimClassPractice;

public class MainWP {

    public static void main(String[] args) {

        WebPage wp = new WebPage() {
            @Override
            public void allowfromUser() {
                System.out.println("User allowed to the WebPage");
            }
        };

        wp.allowfromUser();

    }

}

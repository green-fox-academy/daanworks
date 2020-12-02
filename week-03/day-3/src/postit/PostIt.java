package postit;

public class PostIt {

    String backgroundColor;
    String textColor;
    String text;

    PostIt(String backgroundColor, String textColor, String text) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.text = text;
    }

    public static void main(String[] args) {

        PostIt idea1 = new PostIt("orange", "blue", "Idea 1");
        PostIt awesome = new PostIt("pink", "black", "Awesome");
        PostIt superb = new PostIt("yellow", "green", "Superb!");

    }
}



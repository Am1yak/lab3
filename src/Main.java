/**
 * Main class to demonstrate the TextEditor decorators.
 */
public class Main {

    /**
     * Main method to run the demonstration.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        TextEditor simpleText = new SimpleText();
        simpleText.setText("Hello World");
        simpleText.show();

        TextEditor coloredText = new ColorText(simpleText);
        coloredText.setText("Hello World");
        coloredText.show();

        TextEditor boldText = new ShapeText(simpleText);
        boldText.setText("Hello World");
        boldText.show();

        TextEditor boldColorText = new ColorText(boldText);
        boldColorText.setText("Hello World");
        boldColorText.show();
    }
}
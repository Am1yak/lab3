/**
 * A concrete component of the TextEditor interface.
 */
public class SimpleText implements TextEditor {
    private String text;

    /**
     * Displays the text.
     */
    @Override
    public void show() {
        System.out.println(text);
    }

    /**
     * Sets the text.
     * @param text the text to set.
     */
    @Override
    public void setText(String text) {
        this.text = text;
    }
}

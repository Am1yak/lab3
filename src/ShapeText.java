/**
 * Concrete decorator class that adds shape (bold) to the text.
 */
public class ShapeText extends TextEditorDecorator {

    /**
     * Constructor for ShapeText.
     * @param textEditor the TextEditor to be decorated.
     */
    public ShapeText(TextEditor textEditor) {
        super(textEditor);
    }

    /**
     * Displays the text.
     */
    @Override
    public void show(){
        super.show();
    }

    /**
     * Sets the text with bold formatting.
     * @param text the text to set.
     */
    @Override
    public void setText(String text) {
        super.setText("\033[0;1m" + text);
    }
}

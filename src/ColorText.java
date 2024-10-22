/**
 * Concrete decorator class that adds color to the text.
 */
public class ColorText extends TextEditorDecorator {

    /**
     * Constructor for ColorText.
     * @param editor the TextEditor to be decorated.
     */
    public ColorText(TextEditor editor) {
        super(editor);
    }

    /**
     * Displays the text.
     */
    @Override
    public void show(){
        super.show();
    }

    /**
     * Sets the text with green color formatting.
     * @param text the text to set.
     */
    @Override
    public void setText(String text) {
        super.setText("\u001B[32m" + text + "\u001B[0m");
    }
}

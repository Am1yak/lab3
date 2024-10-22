/**
 * Abstract decorator class for TextEditor.
 */
abstract class TextEditorDecorator implements TextEditor {
    protected TextEditor textEditor;

    /**
     * Constructor for TextEditorDecorator.
     * @param textEditor the TextEditor to be decorated.
     */
    public TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    /**
     * Displays the text.
     */
    @Override
    public void show(){
        textEditor.show();
    }

    /**
     * Sets the text.
     * @param text the text to set.
     */
    @Override
    public void setText(String text) {
        textEditor.setText(text);
    }
}

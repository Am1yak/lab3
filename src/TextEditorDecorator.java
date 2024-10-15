abstract class TextEditorDecorator implements TextEditor {
    protected TextEditor textEditor;

    public TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void show(){
        textEditor.show();
    }

    @Override
    public void setText(String text) {
        textEditor.setText(text);
    }
}

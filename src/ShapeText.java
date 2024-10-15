public class ShapeText extends TextEditorDecorator {
    public ShapeText(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void show(){
        super.show();
    }

    @Override
    public void setText(String text) {
        super.setText("\033[0;1m" + text);
    }
}

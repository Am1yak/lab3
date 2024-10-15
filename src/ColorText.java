public class ColorText extends TextEditorDecorator {
    public ColorText(TextEditor editor) {
        super(editor);
    }

    @Override
    public void show(){
        super.show();
    }

    @Override
    public void setText(String text) {
        super.setText("\u001B[32m" + text + "\u001B[0m");
    }
}

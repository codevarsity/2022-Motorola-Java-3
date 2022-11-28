import javax.swing.plaf.multi.MultiButtonUI;
import java.text.AttributedCharacterIterator;

class MyCode {

}

class MyButtonListener extends MyCode implements ClickListener {

    @Override
    public void onClick(Button button) {
        System.out.println("Button tapped by user");
    }
}


public class ObjectCommunication {
    public static void main(String[] args) {
        Button button = new Button("Login");
        MyButtonListener myButtonListener = new MyButtonListener();
        button.listener = myButtonListener;

        button.buttonTapped();

    }
}

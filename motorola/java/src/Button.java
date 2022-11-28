

interface ClickListener {
    void onClick(Button button);
}

public class Button {
    String title;
    ClickListener listener;

    Button(String title) {
        this.title = title;
    }

    void buttonTapped() {
        listener.onClick(this);
    }
}
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model,View view) {
    this.model = model;
    this.view = view;
    }

    public void processUser() {
        model.setRandomValue();
        System.out.println(model.getRandomValue());
        Scanner sc = new Scanner(System.in);
        boolean guess=false;
        do {
            view.printMessage(View.INPUT_INT_DATA + model.getMinValue() + View.TO + model.getMaxValue());
            int userNumber = userInput(sc);
            guess = model.checkValue(userNumber);
        } while (!guess);

        view.printMessage(View.CONGRATULATION + model.getRandomValue() + ";");
        view.printMessage(View.YOUR_HISTORY + model.getYourHistory());
    }
    private int userInput(Scanner sc) {
        int input = 0;
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.INPUT_INT_DATA);
                sc.next();
            }
            input = sc.nextInt();
            if ((input < model.getMinValue()) || (input > model.getMaxValue())) {
                view.printMessage(View.WRONG_INPUT_INT_DATA);
                continue;
            }
            break;
        }
        return input;

    }

}

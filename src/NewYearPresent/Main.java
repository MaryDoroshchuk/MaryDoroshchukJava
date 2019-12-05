package NewYearPresent;

import NewYearPresent.Controller.Controller;
import NewYearPresent.Model.Model;
import NewYearPresent.View.View;


public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}
package NewYearPresent.Controller;


import NewYearPresent.Model.Chocolate;
import NewYearPresent.Model.Jelly;
import NewYearPresent.Model.Model;
import NewYearPresent.Model.Present;
import NewYearPresent.View.TextConstant;
import NewYearPresent.View.View;


public class Controller {

    public Controller(Model model, View view) {
        Present present = new Present();
        present.add(new Chocolate("Milka", 100));
        present.add(new Chocolate("Toffe", 75));
        present.add(new Jelly("Bee", 25));

        view.printMessages(view.getBundleString(TextConstant.YOUR_PRESENT));
        System.out.print(present.toString()+"\n");

        view.printMessages(view.getBundleString(TextConstant.WEIGHT_PRESENT));
        System.out.println(present.getWeight() + " gram" + "\n");

        view.printMessages(view.getBundleString(TextConstant.SORT_WEIGHT));
        present.sort(new SortByWeight());
        System.out.println(present.toString());

        view.printMessages(view.getBundleString(TextConstant.SORT_SUGAR));
        present.sort(new SortBySugar());
        System.out.println(present.toString());

        view.printMessages(view.getBundleString(TextConstant.FIND_SUGAR));
        System.out.print(present.range(1, 10).getName());
    }
}

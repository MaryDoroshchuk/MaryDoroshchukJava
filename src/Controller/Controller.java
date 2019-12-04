package Controller;

import View.View;

public class Controller {

    public Controller(Model model, View view) {
        Present present = new Present();
        present.add(new Chocolate("Milka", 100));
        present.add(new Chocolate("Toffe", 75));
        present.add(new Jelly("Bee",25));

        System.out.print(View.PRESENT+ "\n" +present.toString());
        System.out.println(View.WEIGHT_PRESENT+present.getWeight() + " gram" + "\n");

        present.sort(new SortByWeight());
        System.out.println(View.SORT_WEIGHT + "\n" +present.toString());

        present.sort(new SortBySugar());
        System.out.println(View.SORT_SUGAR + "\n" +present.toString());
        System.out.print(View.FIND_SUGAR + "\n" +present.range(1, 10).getName());
    }
}

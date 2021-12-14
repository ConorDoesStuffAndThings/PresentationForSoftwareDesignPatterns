public class TestChef {
    public static void main(String[] args) {
        HeadChef chef = new HeadChef();
        LineCook cook = new LineCook();
        Chef chefAdapter = new ChefAdapter(cook);

        System.out.println("The Cook");

        cook.AssignLineCook("Bob");
        cook.ChopFood();
        cook.HeatFood();

        System.out.println("The chef");
        chef.AssignChef("Bobert");
        chef.PrepareFood();
        chef.CookFood();

        System.out.println("The chef with adapter");
        chefAdapter.AssignChef("Cat");
        chefAdapter.PrepareFood();
        chefAdapter.CookFood();
    }
}

public class HeadChef implements Chef{

    @Override
    public void PrepareFood() {
        String food = "Steak";
        System.out.println("Line cook has prepared " + food );
    }

    @Override
    public void CookFood() {
        String food = "Steak";
        System.out.println("Line cook has cooked " + food );
    }

    @Override
    public void AssignChef(String cookName) {
        System.out.println(cookName + " is cooking the food");
    }

}

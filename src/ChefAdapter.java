public class ChefAdapter implements Chef{

    LineCook lineCook;

    public ChefAdapter(LineCook newLineCook){
        lineCook = newLineCook;
    }

    @Override
    public void PrepareFood() {
        lineCook.ChopFood();
    }

    @Override
    public void CookFood() {
        lineCook.HeatFood();
    }

    @Override
    public void AssignChef(String cookName) {
        lineCook.AssignLineCook(cookName);
    }
}

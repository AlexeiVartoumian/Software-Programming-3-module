package examIV.Q3AbstracFactory;

public class GoogleStore extends MobileStore{

    @Override
    public Mobile createAseries() {
        return new PixelAseries();
    }
    @Override
    public Mobile createBseries() {
        return new PixelBseries();
    }
    @Override
    public Mobile createCseries() {
        return new PixelCseries();
    }


}

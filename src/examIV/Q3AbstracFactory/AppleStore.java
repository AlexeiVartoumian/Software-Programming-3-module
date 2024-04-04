package examIV.Q3AbstracFactory;

public class AppleStore extends MobileStore{


    @Override
    public Mobile createAseries() {
        return new AppleAseries();
    }
    @Override
    public Mobile createBseries() {
        return new AppleBseries();
    }
    @Override
    public Mobile createCseries() {
        return new AppleCseries();
    }
}

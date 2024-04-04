package examIV.Q3AbstracFactory;

public class MobileStoreFactory {
    public static MobileStore produceMobileStore(String option){
        if(option.equalsIgnoreCase("Apple")){
            return new AppleStore();
        }
        else if(option.equalsIgnoreCase("Google")){
            return new GoogleStore();
        }
        return null;
    }
}

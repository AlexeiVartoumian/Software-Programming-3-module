package Exam1Take1TookTooLong.Q1DepdencyInjection;

public class UserInfoDI {

        public UserInfoDI(){
        }
        public Object render(SomeDatabase database){
            return database.stuff.get(0);
        }
}

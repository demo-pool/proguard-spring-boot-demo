package cn.devit.demo.biz;

public class DummyService {

    public String getUsername(String id) {
        Exception exception = new Exception();
        exception.fillInStackTrace();
        exception.printStackTrace();
        return "alex";
    }
}

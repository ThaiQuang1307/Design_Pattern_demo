package proxy;

public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Thai Quang");
        access.grantInternetAccess();
        OfficeInternetAccess access1 = new ProxyInternetAccess("Ashwani Rajput");
        access1.grantInternetAccess();
    }
}

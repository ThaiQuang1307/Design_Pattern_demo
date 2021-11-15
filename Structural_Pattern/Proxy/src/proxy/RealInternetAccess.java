package proxy;

public class RealInternetAccess implements OfficeInternetAccess{
    private String employeeName;
    public RealInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }
    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+ employeeName);
    }
}

package abstractfactory;

public class SBI implements Bank{
    private final String BNAME;

    public SBI() {
        BNAME = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}



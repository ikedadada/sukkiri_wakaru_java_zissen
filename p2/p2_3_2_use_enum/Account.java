package p2.p2_3_2_use_enum;

// static import
import static p2.p2_3_2_use_enum.AccountType.FUTSU;
import static p2.p2_3_2_use_enum.AccountType.TEIKI;
import static p2.p2_3_2_use_enum.AccountType.TOUZA;

public class Account {
    private String accountNo;
    private int zandaka;
    private AccountType accountType;

    public Account(String aNo, AccountType aType) {
        if (aType == FUTSU) {
            System.out.println("普通預金です");
        } else if (aType == TOUZA) {
            System.out.println("当座預金です");
        } else if (aType == TEIKI) {
            System.out.println("定期預金です");
        }
        this.accountNo = aNo;
        this.accountType = aType;

    }

    public String getAccountNo() {
        return accountNo;
    }

    public int getZandaka() {
        return zandaka;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}

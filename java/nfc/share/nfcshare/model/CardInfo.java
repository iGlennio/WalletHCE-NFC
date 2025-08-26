package nfc.share.nfcshare.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class CardInfo implements Serializable {
    private Date expireDate;
    private String label;
    private String number;
    private String type;

    public CardInfo(String str, String str2, Date date, String str3) {
        this.number = str;
        this.type = str2;
        this.expireDate = date;
        this.label = str3;
    }

    public Date getExpireDate() {
        return this.expireDate;
    }

    public String getLabel() {
        return this.label;
    }

    public String getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public void setExpireDate(Date date) {
        this.expireDate = date;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.number + "&" + this.type + "&" + this.label + "&" + new SimpleDateFormat("MM/yy").format(this.expireDate);
    }
}

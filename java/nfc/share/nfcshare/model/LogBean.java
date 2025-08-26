package nfc.share.nfcshare.model;

import nfc.share.nfcshare.model.CurrencyLookup;

/* loaded from: classes.dex */
public class LogBean {
    private String amountStr;
    private CurrencyLookup.CurrencyInfo currencyInfo;
    private String date;

    public LogBean(CurrencyLookup.CurrencyInfo currencyInfo, String str, String str2) {
        this.currencyInfo = currencyInfo;
        this.amountStr = str;
        this.date = str2;
    }

    public String getAmountStr() {
        return this.amountStr;
    }

    public CurrencyLookup.CurrencyInfo getCurrencyInfo() {
        return this.currencyInfo;
    }

    public String getDate() {
        return this.date;
    }

    public void setAmountStr(String str) {
        this.amountStr = str;
    }

    public void setCurrencyInfo(CurrencyLookup.CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public void setDate(String str) {
        this.date = str;
    }
}

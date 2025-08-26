package nfc.share.nfcshare.model;

/* loaded from: classes.dex */
public class PaymentResponse {
    private int code;
    private Data data;
    private String msg;
    private long time;

    public class Data {
        private String add;
        private String money;
        private String orderid;

        /* renamed from: qr */
        private String f4375qr;

        public Data() {
        }

        public String getAdd() {
            return this.add;
        }

        public String getMoney() {
            return this.money;
        }

        public String getOrderid() {
            return this.orderid;
        }

        public String getQr() {
            return this.f4375qr;
        }

        public void setAdd(String str) {
            this.add = str;
        }

        public void setMoney(String str) {
            this.money = str;
        }

        public void setOrderid(String str) {
            this.orderid = str;
        }

        public void setQr(String str) {
            this.f4375qr = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public long getTime() {
        return this.time;
    }

    public void setCode(int i2) {
        this.code = i2;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(long j2) {
        this.time = j2;
    }
}

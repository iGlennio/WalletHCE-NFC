package nfc.share.nfcshare.model;

/* loaded from: classes.dex */
public class OrderResponse {
    private int code;
    private Data data;
    private String msg;
    private long time;

    public static class Data {
        private String orderid;
        private int state;

        public String getOrderid() {
            return this.orderid;
        }

        public int getState() {
            return this.state;
        }

        public void setOrderid(String str) {
            this.orderid = str;
        }

        public void setState(int i2) {
            this.state = i2;
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

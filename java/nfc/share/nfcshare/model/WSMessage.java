package nfc.share.nfcshare.model;

/* loaded from: classes.dex */
public class WSMessage {
    private String from;
    private String room;
    private String text;
    private String type;

    public WSMessage(String str, String str2, String str3, String str4) {
        this.type = str;
        this.room = str2;
        this.text = str3;
        this.from = str4;
    }

    public String getFrom() {
        return this.from;
    }

    public String getRoom() {
        return this.room;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setRoom(String str) {
        this.room = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}

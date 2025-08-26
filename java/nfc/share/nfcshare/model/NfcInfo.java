package nfc.share.nfcshare.model;

/* loaded from: classes.dex */
public class NfcInfo {
    private String cardBytes;
    private MqttChannel channel;
    private String sender;

    public NfcInfo(String str, String str2, MqttChannel mqttChannel) {
        this.cardBytes = str;
        this.sender = str2;
        this.channel = mqttChannel;
    }

    public String getCardBytes() {
        return this.cardBytes;
    }

    public MqttChannel getChannel() {
        return this.channel;
    }

    public String getSender() {
        return this.sender;
    }

    public void setCardBytes(String str) {
        this.cardBytes = str;
    }

    public void setChannel(MqttChannel mqttChannel) {
        this.channel = mqttChannel;
    }

    public void setSender(String str) {
        this.sender = str;
    }
}

package p120u1;

import nfc.share.nfcshare.model.MqttChannel;

/* renamed from: u1.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1246a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f4856a;

    static {
        int[] iArr = new int[MqttChannel.values().length];
        f4856a = iArr;
        try {
            iArr[MqttChannel.FETCH_CHANNEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4856a[MqttChannel.SEND_CHANNEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4856a[MqttChannel.CARD_INFO_CHANNEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4856a[MqttChannel.CARD_REMOVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4856a[MqttChannel.NOTIFICATION_CHANNEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4856a[MqttChannel.ANSWER_CHANNEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f4856a[MqttChannel.OFFLINE_CHANNEL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}

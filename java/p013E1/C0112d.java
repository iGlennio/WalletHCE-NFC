package p013E1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;

/* renamed from: E1.d */
/* loaded from: classes.dex */
public final class C0112d extends Handler {

    /* renamed from: a */
    public static final C0112d f327a = new C0112d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        AbstractC1136c.m2637e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC0111c.f325a;
        String loggerName = logRecord.getLoggerName();
        AbstractC1136c.m2636d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i2 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC1136c.m2636d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) AbstractC0111c.f326b.get(loggerName);
        int i3 = 0;
        if (str == null) {
            int length = loggerName.length();
            if (23 <= length) {
                length = 23;
            }
            str = loggerName.substring(0, length);
            AbstractC1136c.m2636d(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i2)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length2 = message.length();
            while (i3 < length2) {
                int m2769u0 = AbstractC1199i.m2769u0(message, '\n', i3, 4);
                if (m2769u0 == -1) {
                    m2769u0 = length2;
                }
                while (true) {
                    min = Math.min(m2769u0, i3 + 4000);
                    String substring = message.substring(i3, min);
                    AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i2, str, substring);
                    if (min >= m2769u0) {
                        break;
                    } else {
                        i3 = min;
                    }
                }
                i3 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}

package p118t1;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: t1.j */
/* loaded from: classes.dex */
public final class AsyncTaskC1240j extends AsyncTask {

    /* renamed from: a */
    public final InterfaceC1239i f4834a;

    /* renamed from: b */
    public int f4835b = 8083;

    public AsyncTaskC1240j(InterfaceC1239i interfaceC1239i) {
        this.f4834a = interfaceC1239i;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String str;
        String[] strArr = (String[]) objArr;
        if (strArr == null || strArr.length == 0 || (str = strArr[0]) == null) {
            return "无效IP地址";
        }
        int i2 = this.f4835b;
        Log.i("PingTask", "ping：IP: " + str + "端口：" + i2);
        long nanoTime = System.nanoTime();
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i2), 2000);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                Log.i("PingTask", "ping: " + millis + "ms");
                String valueOf = millis > 600 ? String.valueOf(0) : String.valueOf(millis);
                socket.close();
                return valueOf;
            } finally {
            }
        } catch (IOException e2) {
            Log.e("PingTask", "TCP连接错误: " + e2.getMessage());
            return String.valueOf(0);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        InterfaceC1239i interfaceC1239i = this.f4834a;
        if (interfaceC1239i != null) {
            interfaceC1239i.mo1685f(str);
        }
    }
}

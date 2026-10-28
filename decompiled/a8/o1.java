package a8;

import com.baidu.carlife.sdk.util.Logger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f188a = new o1();

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        b8.c2 c2Var = (b8.c2) obj;
        if (c2Var instanceof b8.g1) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(((b8.g1) c2Var).f1592b).openConnection();
                i9.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                Logger.INSTANCE.d("CarLife_Vehicle", "【网络请求】请求结果：" + (httpURLConnection.getResponseCode() == 200));
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【网络请求】请求异常: ", e7.getMessage()));
            }
        }
        return t8.z.f12851a;
    }
}

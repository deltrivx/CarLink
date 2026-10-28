package n8;

import cc.b0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Closeable f8935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h9.k f8936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BufferedReader f8937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Process f8940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h9.k f8941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Process process, h9.k kVar, y8.c cVar) {
        super(2, cVar);
        this.f8940f = process;
        this.f8941g = kVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        r rVar = new r(this.f8940f, this.f8941g, cVar);
        rVar.f8939e = obj;
        return rVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        BufferedReader bufferedReader;
        h9.k kVar;
        cc.y yVar;
        Closeable closeable;
        int i7 = this.f8938d;
        Process process = this.f8940f;
        try {
            if (i7 == 0) {
                t8.a.e(obj);
                cc.y yVar2 = (cc.y) this.f8939e;
                try {
                    InputStream inputStream = process.getInputStream();
                    i9.l.d(inputStream, "getInputStream(...)");
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, zb.a.f15804a), ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                    kVar = this.f8941g;
                    yVar = yVar2;
                    closeable = bufferedReader;
                } catch (Exception e7) {
                    Logger.INSTANCE.e("CarLife_Vehicle", "【日志监听】读取失败: " + e7.getMessage(), e7);
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bufferedReader = this.f8937c;
                kVar = this.f8936b;
                closeable = this.f8935a;
                yVar = (cc.y) this.f8939e;
                try {
                    t8.a.e(obj);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        g5.a.m(closeable, th);
                        throw th2;
                    }
                }
            }
            while (b0.q(yVar)) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    kVar.invoke(line);
                } else {
                    this.f8939e = yVar;
                    this.f8935a = closeable;
                    this.f8936b = kVar;
                    this.f8937c = bufferedReader;
                    this.f8938d = 1;
                    Object objH = b0.h(10L, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objH == aVar) {
                        return aVar;
                    }
                }
            }
            g5.a.m(closeable, null);
            process.destroy();
            process.destroyForcibly();
            return z.f12851a;
        } catch (Throwable th3) {
            process.destroy();
            process.destroyForcibly();
            throw th3;
        }
    }
}

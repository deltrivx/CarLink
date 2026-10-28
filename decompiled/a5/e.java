package a5;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import b8.m2;
import b8.r2;
import b8.s2;
import b8.y;
import cc.j;
import cc.l;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import e8.c0;
import e8.d1;
import f1.c2;
import f1.k1;
import f1.x1;
import h9.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import l0.q1;
import l0.u0;
import n3.n;
import n4.h;
import o1.i;
import p1.t;
import p1.u;
import pc.l0;
import pc.m0;
import s.i0;
import t8.z;
import u0.p;
import w1.o;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f43a = i7;
        this.f44b = obj;
    }

    public /* synthetic */ e(k kVar, c0 c0Var) {
        this.f43a = 1;
        this.f44b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0081, LOOP:2: B:13:0x002c->B:24:0x0070, LOOP_END, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x0011, B:10:0x001a, B:13:0x002c, B:15:0x0041, B:17:0x004d, B:19:0x0057, B:21:0x0065, B:26:0x0077, B:24:0x0070), top: B:44:0x0011, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0077 A[EDGE_INSN: B:52:0x0077->B:26:0x0077 BREAK  A[LOOP:2: B:13:0x002c->B:24:0x0070], SYNTHETIC] */
    private final Object e() {
        Object[] objArr;
        char c10;
        u uVar = (u) this.f44b;
        do {
            synchronized (uVar.f10094g) {
                try {
                    if (!uVar.f10090c) {
                        uVar.f10090c = true;
                        try {
                            h1.e eVar = uVar.f10093f;
                            Object[] objArr2 = eVar.f6421a;
                            int i7 = eVar.f6423c;
                            int i10 = 0;
                            while (i10 < i7) {
                                t tVar = (t) objArr2[i10];
                                i0 i0Var = tVar.f10083g;
                                k kVar = tVar.f10077a;
                                Object[] objArr3 = i0Var.f12445b;
                                long[] jArr = i0Var.f12444a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j5 = jArr[i11];
                                        objArr = objArr2;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i11 != length) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                            objArr2 = objArr;
                                        } else {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j5 & 255) < 128) {
                                                    c10 = '\b';
                                                    kVar.invoke(objArr3[(i11 << 3) + i14]);
                                                } else {
                                                    c10 = '\b';
                                                }
                                                j5 >>= c10;
                                                i14++;
                                                i12 = 8;
                                            }
                                            if (i13 != i12) {
                                                break;
                                            }
                                            if (i11 != length) {
                                                break;
                                            }
                                            i11++;
                                            objArr2 = objArr;
                                        }
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                i0Var.b();
                                i10++;
                                objArr2 = objArr;
                            }
                            uVar.f10090c = false;
                        } catch (Throwable th) {
                            uVar.f10090c = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (uVar.b());
        return z.f12851a;
    }

    @Override // h9.a
    public final Object invoke() throws PendingIntent.CanceledException {
        j jVarB;
        int i7 = 0;
        switch (this.f43a) {
            case 0:
                g gVar = (g) this.f44b;
                gVar.g().a(new b(i7, gVar));
                return z.f12851a;
            case 1:
                ((k) this.f44b).invoke(new m2("Boot", "系统启动", "当系统启动时", new y()));
                return z.f12851a;
            case 2:
                o.b((o) this.f44b);
                return z.f12851a;
            case 3:
                return ((SensorManager) ((d1) this.f44b).f4510b.getValue()).getDefaultSensor(5);
            case 4:
                c2 c2Var = (c2) this.f44b;
                synchronized (c2Var.f4904b) {
                    jVarB = c2Var.B();
                    if (((x1) c2Var.f4921t.getValue()).compareTo(x1.f5198b) <= 0) {
                        Throwable th = c2Var.f4906d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (jVarB != null) {
                    ((l) jVarB).resumeWith(z.f12851a);
                }
                return z.f12851a;
            case 5:
                s2 s2Var = (s2) this.f44b;
                r2 r2Var = s2.f1649c;
                int i10 = s2Var.f1653b;
                r2Var.getClass();
                r2.b(i10);
                return Boolean.FALSE;
            case 6:
                return (x1.c) this.f44b;
            case 7:
                j0.b bVar = (j0.b) this.f44b;
                bVar.M.invoke(Boolean.valueOf(!bVar.L));
                return z.f12851a;
            case 8:
                j7.d dVar = (j7.d) this.f44b;
                try {
                    n7.c cVar = new n7.c(16000, 1, 16);
                    InputStream inputStreamOpen = dVar.f6960a.getContext().getAssets().open("speech_start.pcm");
                    i9.l.d(inputStreamOpen, "open(...)");
                    return n.j0(cVar, inputStreamOpen, inputStreamOpen.available());
                } catch (IOException e7) {
                    Logger.INSTANCE.e(Constants.TAG, ob.a.q("【语音音频】加载提示音失败: ", e7.getMessage()), e7);
                    throw new RuntimeException("Failed to load audio source", e7);
                }
            case 9:
                AtomicLong atomicLong = ((w0.d1) this.f44b).f13765d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            case 10:
                return new q1((x0) this.f44b, 0.0f);
            case 11:
                return ((u0) this.f44b).d();
            case 12:
                l3.b bVar2 = (l3.b) this.f44b;
                k1 k1Var = bVar2.f7994c;
                if (((x1.e) k1Var.getValue()).f14535a == 9205357640488583168L || x1.e.e(((x1.e) k1Var.getValue()).f14535a)) {
                    return null;
                }
                return bVar2.f7992a.b(((x1.e) k1Var.getValue()).f14535a);
            case 13:
                return (m3.o) this.f44b;
            case 14:
                return n3.u.m("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent", nc.b.f9068c, new nc.e[0], new mc.c((mc.d) this.f44b, i7));
            case 15:
                n8.y yVar = (n8.y) this.f44b;
                return new f(new c5.a(yVar, new e(i7, yVar)));
            case 16:
                nc.f fVar = (nc.f) this.f44b;
                return Integer.valueOf(m0.c(fVar, fVar.k));
            case 17:
                o1.a aVar = (o1.a) this.f44b;
                o1.j jVar = aVar.f9263a;
                Object obj = aVar.f9266d;
                if (obj != null) {
                    return jVar.W(aVar, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 18:
                i iVar = (i) this.f44b;
                Bundle bundleJ = k9.a.j((t8.j[]) Arrays.copyOf(new t8.j[0], 0));
                iVar.f9283b.b(bundleJ);
                if (bundleJ.isEmpty()) {
                    return null;
                }
                return bundleJ;
            case 19:
                return e();
            case 20:
                return n3.u.m("kotlin.Unit", nc.i.f9093f, new nc.e[0], new c8.k(24, (l0) this.f44b));
            case 21:
                return ((s0.e) this.f44b).K();
            case 22:
                ((s0.b) this.f44b).close();
                return z.f12851a;
            case 23:
                PendingIntent actionIntent = ((RemoteAction) this.f44b).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e10) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e10);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return z.f12851a;
            case 24:
                r0.f fVar2 = (r0.f) this.f44b;
                return fVar2.f11129n ? h.r(fVar2) : o0.c.f9250b;
            case 25:
                Object systemService = ((View) ((u0.k) this.f44b).f12990b).getContext().getSystemService("input_method");
                i9.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return new BaseInputConnection(((p) this.f44b).f13014a, false);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return i9.l.h((Object[]) this.f44b);
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                return ((Iterable) this.f44b).iterator();
            default:
                v0.n nVar = (v0.n) this.f44b;
                nVar.B = null;
                q2.f.n(nVar);
                q2.f.m(nVar);
                q2.f.l(nVar);
                return Boolean.TRUE;
        }
    }
}

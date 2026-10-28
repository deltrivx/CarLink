package com.baidu.carlife.sdk.receiver.transport.hotspot;

import a9.e;
import a9.i;
import cc.a1;
import cc.b0;
import cc.f0;
import cc.k0;
import cc.y;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.n;
import i9.l;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import lc.j;
import n9.d;
import t8.a;
import t8.z;
import u8.p;
import u8.q;
import y8.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotLanScanner;", "", "<init>", "()V", "", "ip", "", "checkPortOpen", "(Ljava/lang/String;)Z", "seedIp", "Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotLanScanner$ScanCallback;", "callback", "Lt8/z;", "startScan", "(Ljava/lang/String;Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotLanScanner$ScanCallback;)V", "stopScan", "", "TARGET_PORT", "I", "SCAN_TIMEOUT", "MAX_CONCURRENCY", "Lcc/a1;", "scanJob", "Lcc/a1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFound", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ScanCallback", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class HotspotLanScanner {
    private static final int MAX_CONCURRENCY = 64;
    private static final int SCAN_TIMEOUT = 200;
    private static final int TARGET_PORT = 7240;
    private static a1 scanJob;
    public static final HotspotLanScanner INSTANCE = new HotspotLanScanner();
    private static final AtomicBoolean isFound = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotLanScanner$ScanCallback;", "", "", "ip", "Lt8/z;", "onFound", "(Ljava/lang/String;)V", "onFinished", "()V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface ScanCallback {
        void onFinished();

        void onFound(String ip);
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotLanScanner$startScan$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @e(c = "com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotLanScanner$startScan$1", f = "HotspotLanScanner.kt", l = {78}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcc/y;", "Lt8/z;", "<anonymous>", "(Lcc/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends i implements n {
        final /* synthetic */ ScanCallback $callback;
        final /* synthetic */ String $prefix;
        final /* synthetic */ List<Integer> $targetSuffixes;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Integer> list, ScanCallback scanCallback, String str, c cVar) {
            super(2, cVar);
            this.$targetSuffixes = list;
            this.$callback = scanCallback;
            this.$prefix = str;
        }

        @Override // a9.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetSuffixes, this.$callback, this.$prefix, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h9.n
        public final Object invoke(y yVar, c cVar) {
            return ((AnonymousClass1) create(yVar, cVar)).invokeSuspend(z.f12851a);
        }

        @Override // a9.a
        public final Object invokeSuspend(Object obj) {
            ScanCallback scanCallback;
            int i7 = this.label;
            try {
                try {
                    if (i7 == 0) {
                        a.e(obj);
                        y yVar = (y) this.L$0;
                        int i10 = j.f8382a;
                        lc.i iVar = new lc.i(64);
                        List<Integer> list = this.$targetSuffixes;
                        String str = this.$prefix;
                        ScanCallback scanCallback2 = this.$callback;
                        ArrayList arrayList = new ArrayList(q.a0(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            HotspotLanScanner$startScan$1$jobs$1$1 hotspotLanScanner$startScan$1$jobs$1$1 = new HotspotLanScanner$startScan$1$jobs$1$1(str, ((Number) it.next()).intValue(), iVar, scanCallback2, yVar, null);
                            cc.a f0Var = new f0(b0.t(yVar, y8.i.f15108a), true);
                            f0Var.g0(cc.z.f2689a, f0Var, hotspotLanScanner$startScan$1$jobs$1$1);
                            arrayList.add(f0Var);
                        }
                        this.label = 1;
                        Object objC = b0.c(arrayList, this);
                        z8.a aVar = z8.a.f15774a;
                        if (objC == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.e(obj);
                    }
                    if (!HotspotLanScanner.isFound.get()) {
                        scanCallback = this.$callback;
                        scanCallback.onFinished();
                    }
                } catch (CancellationException unused) {
                    if (!HotspotLanScanner.isFound.get()) {
                        scanCallback = this.$callback;
                    }
                } catch (Throwable th) {
                    if (HotspotLanScanner.isFound.get()) {
                        throw th;
                    }
                    try {
                        this.$callback.onFinished();
                        throw th;
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        throw th;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return z.f12851a;
        }
    }

    private HotspotLanScanner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPortOpen(String ip) throws Throwable {
        Socket socket = null;
        try {
            Socket socket2 = new Socket();
            try {
                socket2.connect(new InetSocketAddress(ip, TARGET_PORT), 200);
                try {
                    socket2.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
                socket = socket2;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                socket = socket2;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void startScan(String seedIp, ScanCallback callback) {
        final int i7;
        l.e(callback, "callback");
        stopScan();
        if (seedIp == null || seedIp.length() == 0) {
            callback.onFinished();
            return;
        }
        int iD0 = zb.j.D0('.', seedIp);
        if (iD0 == -1) {
            callback.onFinished();
            return;
        }
        int i10 = iD0 + 1;
        String strR0 = zb.j.R0(i10, seedIp);
        try {
            String strSubstring = seedIp.substring(i10);
            l.d(strSubstring, "substring(...)");
            i7 = Integer.parseInt(strSubstring);
        } catch (Exception unused) {
            i7 = 1;
        }
        isFound.set(false);
        List listE0 = p.E0(new d(1, 254, 1), new Comparator() { // from class: com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotLanScanner$startScan$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return n3.n.X(Integer.valueOf(Math.abs(((Number) t2).intValue() - i7)), Integer.valueOf(Math.abs(((Number) t4).intValue() - i7)));
            }
        });
        jc.e eVar = k0.f2635a;
        scanJob = b0.s(b0.a(jc.d.f7117c), null, new AnonymousClass1(listE0, callback, strR0, null), 3);
    }

    public final void stopScan() {
        a1 a1Var = scanJob;
        if (a1Var != null) {
            a1Var.a(null);
        }
        scanJob = null;
    }
}

package com.baidu.carlife.sdk.receiver.transport.hotspot;

import a9.e;
import a9.i;
import cc.b0;
import cc.l;
import cc.y;
import h9.n;
import kotlin.Metadata;
import lc.h;
import t8.a;
import t8.z;
import y8.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotLanScanner$startScan$1$jobs$1$1", f = "HotspotLanScanner.kt", l = {113}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcc/y;", "Lt8/z;", "<anonymous>", "(Lcc/y;)V"}, k = 3, mv = {1, 6, 0})
public final class HotspotLanScanner$startScan$1$jobs$1$1 extends i implements n {
    final /* synthetic */ y $$this$launch;
    final /* synthetic */ HotspotLanScanner.ScanCallback $callback;
    final /* synthetic */ int $i;
    final /* synthetic */ String $prefix;
    final /* synthetic */ lc.e $semaphore;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotspotLanScanner$startScan$1$jobs$1$1(String str, int i7, lc.e eVar, HotspotLanScanner.ScanCallback scanCallback, y yVar, c cVar) {
        super(2, cVar);
        this.$prefix = str;
        this.$i = i7;
        this.$semaphore = eVar;
        this.$callback = scanCallback;
        this.$$this$launch = yVar;
    }

    @Override // a9.a
    public final c create(Object obj, c cVar) {
        HotspotLanScanner$startScan$1$jobs$1$1 hotspotLanScanner$startScan$1$jobs$1$1 = new HotspotLanScanner$startScan$1$jobs$1$1(this.$prefix, this.$i, this.$semaphore, this.$callback, this.$$this$launch, cVar);
        hotspotLanScanner$startScan$1$jobs$1$1.L$0 = obj;
        return hotspotLanScanner$startScan$1$jobs$1$1;
    }

    @Override // h9.n
    public final Object invoke(y yVar, c cVar) {
        return ((HotspotLanScanner$startScan$1$jobs$1$1) create(yVar, cVar)).invokeSuspend(z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        HotspotLanScanner.ScanCallback scanCallback;
        y yVar;
        int andDecrement;
        Object objO;
        int i7 = this.label;
        z zVar = z.f12851a;
        if (i7 == 0) {
            a.e(obj);
            y yVar2 = (y) this.L$0;
            if (HotspotLanScanner.isFound.get() || !b0.q(yVar2)) {
                return zVar;
            }
            str = this.$prefix + this.$i;
            obj2 = this.$semaphore;
            scanCallback = this.$callback;
            yVar = this.$$this$launch;
            this.L$0 = str;
            this.L$1 = obj2;
            this.L$2 = scanCallback;
            this.L$3 = yVar;
            this.label = 1;
            h hVar = (h) obj2;
            hVar.getClass();
            int i10 = hVar.f8380a;
            do {
                andDecrement = h.f8379g.getAndDecrement(hVar);
            } while (andDecrement > i10);
            z8.a aVar = z8.a.f15774a;
            if (andDecrement > 0) {
                objO = zVar;
            } else {
                l lVarN = b0.n(n4.h.L(this));
                try {
                    if (!hVar.a(lVarN)) {
                        while (true) {
                            int andDecrement2 = h.f8379g.getAndDecrement(hVar);
                            if (andDecrement2 <= i10) {
                                if (andDecrement2 > 0) {
                                    lVarN.e(zVar, hVar.f8381b);
                                    break;
                                }
                                if (hVar.a(lVarN)) {
                                    break;
                                }
                            }
                        }
                    }
                    objO = lVarN.o();
                    if (objO != aVar) {
                        objO = zVar;
                    }
                    if (objO != aVar) {
                        objO = zVar;
                    }
                } catch (Throwable th) {
                    lVarN.v();
                    throw th;
                }
            }
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (y) this.L$3;
            scanCallback = (HotspotLanScanner.ScanCallback) this.L$2;
            obj2 = (lc.e) this.L$1;
            str = (String) this.L$0;
            a.e(obj);
        }
        try {
            if (HotspotLanScanner.INSTANCE.checkPortOpen(str) && HotspotLanScanner.isFound.compareAndSet(false, true)) {
                try {
                    scanCallback.onFound(str);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                b0.e(yVar, null);
            }
            ((h) obj2).b();
            return zVar;
        } catch (Throwable th2) {
            ((h) obj2).b();
            throw th2;
        }
    }
}

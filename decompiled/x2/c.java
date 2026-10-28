package x2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import c1.v2;
import cc.b0;
import cc.k1;
import cc.o1;
import fc.i;
import java.util.function.Consumer;
import n3.k;
import n3.r;
import r2.u;
import t8.z;
import y1.h0;
import y2.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f14547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.b f14549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f14550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hc.c f14551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3.e f14552f;

    public c(m mVar, k kVar, hc.c cVar, wb.b bVar, u uVar) {
        this.f14547a = mVar;
        this.f14548b = kVar;
        this.f14549c = bVar;
        this.f14550d = uVar;
        this.f14551e = new hc.c(cVar.f6504a.s(d.f14553a));
        this.f14552f = new c3.e(kVar.f8744d - kVar.f8742b, new v2(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c cVar, ScrollCaptureSession scrollCaptureSession, k kVar, a9.c cVar2) {
        a aVar;
        int i7;
        int i10;
        ScrollCaptureSession scrollCaptureSessionH;
        int i11;
        k kVar2;
        int i12;
        int iM;
        int iM2;
        int i13;
        int i14;
        Canvas canvasLockHardwareCanvas;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i15 = aVar.f14542g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f14542g = i15 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, cVar2);
            }
        } else {
            aVar = new a(cVar, cVar2);
        }
        Object obj = aVar.f14540e;
        int i16 = aVar.f14542g;
        z8.a aVar2 = z8.a.f15774a;
        if (i16 == 0) {
            t8.a.e(obj);
            i7 = kVar.f8742b;
            i10 = kVar.f8744d;
            c3.e eVar = cVar.f14552f;
            aVar.f14536a = scrollCaptureSession;
            aVar.f14537b = kVar;
            aVar.f14538c = i7;
            aVar.f14539d = i10;
            aVar.f14542g = 1;
            int i17 = eVar.f2370a;
            if (i7 > i10) {
                throw new IllegalArgumentException(a2.f.D(i7, i10, "Expected min=", " ≤ max=").toString());
            }
            int i18 = i10 - i7;
            if (i18 > i17) {
                throw new IllegalArgumentException(a2.f.D(i18, i17, "Expected range (", ") to be ≤ viewportSize=").toString());
            }
            float f10 = i7;
            float f11 = eVar.f2371b;
            Object obj2 = z.f12851a;
            if (f10 < f11 || i10 > i17 + f11) {
                Object objB = eVar.b((f10 < f11 ? i7 : i10 - i17) - f11, aVar);
                if (objB != aVar2) {
                    objB = obj2;
                }
                if (objB == aVar2) {
                    obj2 = objB;
                }
            }
            if (obj2 != aVar2) {
            }
            return aVar2;
        }
        if (i16 == 1) {
            int i19 = aVar.f14539d;
            int i20 = aVar.f14538c;
            k kVar3 = aVar.f14537b;
            ScrollCaptureSession scrollCaptureSessionH2 = c3.c.h(aVar.f14536a);
            t8.a.e(obj);
            i7 = i20;
            kVar = kVar3;
            i10 = i19;
            scrollCaptureSession = scrollCaptureSessionH2;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = aVar.f14539d;
            i12 = aVar.f14538c;
            kVar2 = aVar.f14537b;
            scrollCaptureSessionH = c3.c.h(aVar.f14536a);
            t8.a.e(obj);
        }
        c3.e eVar2 = cVar.f14552f;
        iM = r.m(i12 - k9.a.M(eVar2.f2371b), 0, eVar2.f2370a);
        c3.e eVar3 = cVar.f14552f;
        iM2 = r.m(i11 - k9.a.M(eVar3.f2371b), 0, eVar3.f2370a);
        i13 = kVar2.f8741a;
        i14 = kVar2.f8743c;
        if (iM == iM2) {
            return k.f8740e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionH.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i13, -iM);
            k kVar4 = cVar.f14548b;
            canvasLockHardwareCanvas.translate(-kVar4.f8741a, -kVar4.f8742b);
            cVar.f14550d.getRootView().draw(canvasLockHardwareCanvas);
            int iM3 = k9.a.M(cVar.f14552f.f2371b);
            return new k(i13, iM + iM3, i14, iM2 + iM3);
        } finally {
            scrollCaptureSessionH.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        b bVar = b.f14543b;
        aVar.f14536a = scrollCaptureSession;
        aVar.f14537b = kVar;
        aVar.f14538c = i7;
        aVar.f14539d = i10;
        aVar.f14542g = 2;
        if (f1.b.q(aVar.getContext()).m(bVar, aVar) != aVar2) {
            scrollCaptureSessionH = scrollCaptureSession;
            i11 = i10;
            kVar2 = kVar;
            i12 = i7;
            c3.e eVar4 = cVar.f14552f;
            iM = r.m(i12 - k9.a.M(eVar4.f2371b), 0, eVar4.f2370a);
            c3.e eVar5 = cVar.f14552f;
            iM2 = r.m(i11 - k9.a.M(eVar5.f2371b), 0, eVar5.f2370a);
            i13 = kVar2.f8741a;
            i14 = kVar2.f8743c;
            if (iM == iM2) {
                return k.f8740e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionH.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i13, -iM);
            k kVar5 = cVar.f14548b;
            canvasLockHardwareCanvas.translate(-kVar5.f8741a, -kVar5.f8742b);
            cVar.f14550d.getRootView().draw(canvasLockHardwareCanvas);
            int iM4 = k9.a.M(cVar.f14552f.f2371b);
            return new k(i13, iM + iM4, i14, iM2 + iM4);
        }
        return aVar2;
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        b0.s(this.f14551e, k1.f2636b, new b0.g(this, runnable, null, 24), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        o1 o1VarS = b0.s(this.f14551e, null, new i(this, scrollCaptureSession, rect, consumer, null, 8), 3);
        o1VarS.t(new b2.a(21, cancellationSignal));
        cancellationSignal.setOnCancelListener(new u0.i(1, o1VarS));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(h0.y(this.f14548b));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f14552f.f2371b = 0.0f;
        ((f1.k1) this.f14549c.f14284a).setValue(Boolean.TRUE);
        runnable.run();
    }
}

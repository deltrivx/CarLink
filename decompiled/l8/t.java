package l8;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import android.os.Looper;
import cc.a1;
import cc.o1;
import f1.b1;
import f1.g1;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b1 b1Var, b1 b1Var2, y8.c cVar) {
        super(2, cVar);
        this.f8253a = 1;
        this.f8254b = b1Var;
        this.f8255c = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, y8.c cVar, int i7) {
        super(2, cVar);
        this.f8253a = i7;
        this.f8255c = obj;
        this.f8254b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u0.g gVar, y8.c cVar) {
        super(2, cVar);
        this.f8253a = 4;
        this.f8254b = gVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f8253a) {
            case 0:
                return new t((h9.k) this.f8255c, (b1) this.f8254b, cVar, 0);
            case 1:
                return new t((b1) this.f8254b, (b1) this.f8255c, cVar);
            case 2:
                return new t((UsbManager) this.f8255c, (p1.p) this.f8254b, cVar, 2);
            case 3:
                return new t((g1) this.f8255c, (g1) this.f8254b, cVar, 3);
            default:
                t tVar = new t((u0.g) this.f8254b, cVar);
                tVar.f8255c = obj;
                return tVar;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f8253a) {
            case 0:
                t tVar = (t) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                tVar.invokeSuspend(zVar);
                return zVar;
            case 1:
                t tVar2 = (t) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                tVar2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                t tVar3 = (t) create(yVar, cVar);
                t8.z zVar3 = t8.z.f12851a;
                tVar3.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                t tVar4 = (t) create(yVar, cVar);
                t8.z zVar4 = t8.z.f12851a;
                tVar4.invokeSuspend(zVar4);
                return zVar4;
            default:
                return ((t) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i7 = this.f8253a;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f8254b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                h9.k kVar = (h9.k) this.f8255c;
                if (kVar != null) {
                    kVar.invoke((j0) ((b1) obj2).getValue());
                }
                return zVar;
            case 1:
                t8.a.e(obj);
                o7.g gVar = o7.g.f9489a;
                if (((String) ((b1) obj2).getValue()).length() > 0) {
                    ((b1) this.f8255c).setValue(o7.g.f9490b.i());
                }
                return zVar;
            case 2:
                t8.a.e(obj);
                UsbManager usbManager = (UsbManager) this.f8255c;
                if (usbManager != null) {
                    p1.p pVar = (p1.p) obj2;
                    pVar.clear();
                    Collection<UsbDevice> collectionValues = usbManager.getDeviceList().values();
                    i9.l.d(collectionValues, "<get-values>(...)");
                    pVar.addAll(collectionValues);
                }
                return zVar;
            case 3:
                t8.a.e(obj);
                t8.o oVar = n8.n.f8927a;
                g1 g1Var = (g1) this.f8255c;
                g1 g1Var2 = (g1) obj2;
                new Handler(Looper.getMainLooper()).post(new n8.l("FLOAT_ICON_SWITCH", -2, -2, (int) g1Var.f(), (int) g1Var2.f()));
                t8.o oVar2 = n8.d.f8898a;
                n8.d.f((int) g1Var.f(), "FLOAT_ICON_OFFSET_X");
                n8.d.f((int) g1Var2.f(), "FLOAT_ICON_OFFSET_Y");
                return zVar;
            default:
                t8.a.e(obj);
                cc.y yVar = (cc.y) this.f8255c;
                u0.g gVar2 = (u0.g) obj2;
                a1 a1Var = (a1) gVar2.f12984b.getAndSet(null);
                AtomicReference atomicReference = gVar2.f12984b;
                o1 o1VarS = cc.b0.s(yVar, null, new b0.g(a1Var, gVar2, null, 17), 3);
                while (!atomicReference.compareAndSet(null, o1VarS)) {
                    if (atomicReference.get() != null) {
                        z10 = false;
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = true;
                return Boolean.valueOf(z10);
        }
    }
}

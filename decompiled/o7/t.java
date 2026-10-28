package o7;

import a8.k0;
import android.hardware.usb.UsbDevice;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements h9.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1.p f9517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.p f9518b;

    public t(p1.p pVar, p1.p pVar2) {
        this.f9517a = pVar;
        this.f9518b = pVar2;
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        f1.s sVar = (f1.s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        i9.l.e((f0.c) obj, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= sVar.d(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && sVar.z()) {
            sVar.Q();
        } else {
            UsbDevice usbDevice = (UsbDevice) this.f9517a.get(iIntValue);
            final String str = usbDevice.getVendorId() + "-" + usbDevice.getProductId();
            final p1.p pVar = this.f9518b;
            final boolean zContains = pVar.contains(str);
            n1.c cVarE = n1.h.e(183713387, new k0(19, usbDevice, str), sVar);
            n1.c cVarE2 = n1.h.e(495819594, new s(zContains), sVar);
            sVar.W(-1746271574);
            boolean zG = sVar.g(zContains) | sVar.f(str);
            Object objK = sVar.K();
            if (zG || objK == f1.n.f5051a) {
                objK = new h9.a() { // from class: o7.r
                    @Override // h9.a
                    public final Object invoke() {
                        boolean z10 = zContains;
                        p1.p pVar2 = pVar;
                        String str2 = str;
                        if (z10) {
                            pVar2.remove(str2);
                        } else {
                            pVar2.add(str2);
                        }
                        return z.f12851a;
                    }
                };
                sVar.h0(objK);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, false, (h9.a) objK, sVar, 54, 4);
        }
        return z.f12851a;
    }
}

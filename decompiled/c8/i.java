package c8;

import b8.n2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.p f2513b;

    public /* synthetic */ i(p1.p pVar, int i7) {
        this.f2512a = i7;
        this.f2513b = pVar;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f2512a;
        t8.z zVar = t8.z.f12851a;
        p1.p pVar = this.f2513b;
        switch (i7) {
            case 0:
                pVar.clear();
                break;
            case 1:
                n2.Companion.getClass();
                pVar.addAll(n2.f1621g);
                break;
            default:
                t8.o oVar = n8.d.f8898a;
                n8.d.h("CONNECT_USB_DEVICE_IGNORE");
                pVar.clear();
                break;
        }
        return zVar;
    }
}

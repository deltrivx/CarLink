package gb;

import u8.w;

/* JADX INFO: loaded from: classes.dex */
public final class r implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6201b;

    public /* synthetic */ r(s sVar, int i7) {
        this.f6200a = i7;
        this.f6201b = sVar;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f6200a;
        s sVar = this.f6201b;
        switch (i7) {
            case 0:
                lb.h hVar = sVar.f6203b;
                return n3.l.J(za.k.i(hVar), za.k.j(hVar));
            default:
                return sVar.f6204c ? n3.l.K(za.k.h(sVar.f6203b)) : w.f13122a;
        }
    }
}

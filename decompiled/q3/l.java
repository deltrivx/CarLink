package q3;

import f1.s;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10929a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.p f10930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t8.e f10932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h9.k kVar, r1.p pVar, int i7) {
        super(2);
        this.f10932d = kVar;
        this.f10930b = pVar;
        this.f10931c = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r1.p pVar, h9.n nVar, int i7) {
        super(2);
        this.f10930b = pVar;
        this.f10932d = nVar;
        this.f10931c = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f10929a;
        s sVar = (s) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                androidx.compose.ui.viewinterop.a.a(f1.b.y(this.f10931c | 1), sVar, (h9.k) this.f10932d, this.f10930b);
                break;
            default:
                n3.l.j(this.f10930b, (h9.n) this.f10932d, sVar, f1.b.y(this.f10931c | 1));
                break;
        }
        return z.f12851a;
    }
}

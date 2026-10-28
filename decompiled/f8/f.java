package f8;

import f1.s;
import h9.n;
import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f5490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5492d;

    public /* synthetic */ f(i iVar, List list, boolean z10, int i7, int i10) {
        this.f5489a = i10;
        this.f5490b = iVar;
        this.f5491c = list;
        this.f5492d = z10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f5489a;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f5490b.c(this.f5491c, this.f5492d, sVar, f1.b.y(519));
                break;
            case 1:
                this.f5490b.e(this.f5491c, this.f5492d, sVar, f1.b.y(519));
                break;
            default:
                this.f5490b.a(this.f5491c, this.f5492d, sVar, f1.b.y(567));
                break;
        }
        return z.f12851a;
    }
}

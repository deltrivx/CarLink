package m7;

import f1.s;
import h9.n;
import h9.o;
import java.io.Serializable;
import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8564a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f8568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8569f;

    public /* synthetic */ c(i iVar, List list, t8.j jVar, boolean z10, o oVar, int i7) {
        this.f8567d = iVar;
        this.f8565b = list;
        this.f8568e = jVar;
        this.f8566c = z10;
        this.f8569f = oVar;
    }

    public /* synthetic */ c(w7.f fVar, List list, String str, String str2, boolean z10, int i7) {
        this.f8567d = fVar;
        this.f8565b = list;
        this.f8568e = str;
        this.f8569f = str2;
        this.f8566c = z10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8564a) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(27655);
                ((i) this.f8567d).a(this.f8565b, (t8.j) this.f8568e, this.f8566c, (o) this.f8569f, (s) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(25015);
                ((w7.f) this.f8567d).e(this.f8565b, (String) this.f8568e, (String) this.f8569f, this.f8566c, (s) obj, iY2);
                break;
        }
        return z.f12851a;
    }
}

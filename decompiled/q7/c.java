package q7;

import f1.s;
import h9.n;
import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10962d;

    public /* synthetic */ c(t7.g gVar, boolean z10, h9.a aVar, int i7, int i10) {
        this.f10959a = i10;
        this.f10962d = gVar;
        this.f10960b = z10;
        this.f10961c = aVar;
    }

    public /* synthetic */ c(w7.f fVar, List list, boolean z10, int i7) {
        this.f10959a = 4;
        this.f10962d = fVar;
        this.f10961c = list;
        this.f10960b = z10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10959a) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(49);
                ((h) this.f10962d).d(this.f10960b, (h9.a) this.f10961c, (s) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(49);
                ((r7.a) this.f10962d).d(this.f10960b, (h9.a) this.f10961c, (s) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = f1.b.y(49);
                ((s7.d) this.f10962d).d(this.f10960b, (h9.a) this.f10961c, (s) obj, iY3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = f1.b.y(49);
                ((u7.e) this.f10962d).d(this.f10960b, (h9.a) this.f10961c, (s) obj, iY4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY5 = f1.b.y(391);
                ((w7.f) this.f10962d).a((List) this.f10961c, this.f10960b, (s) obj, iY5);
                break;
        }
        return z.f12851a;
    }
}

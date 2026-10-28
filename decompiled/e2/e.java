package e2;

import java.util.ArrayList;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f4143j;
    public boolean k;

    public e(String str, float f10, float f11, float f12, float f13, long j5, int i7, boolean z10, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        long j10 = (i10 & 32) != 0 ? y1.q.f14958m : j5;
        int i11 = (i10 & 64) != 0 ? 5 : i7;
        this.f4134a = str;
        this.f4135b = f10;
        this.f4136c = f11;
        this.f4137d = f12;
        this.f4138e = f13;
        this.f4139f = j10;
        this.f4140g = i11;
        this.f4141h = z10;
        ArrayList arrayList = new ArrayList();
        this.f4142i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f4143j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, n0 n0Var) {
        if (eVar.k) {
            n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = eVar.f4142i;
        ((d) arrayList2.get(arrayList2.size() - 1)).f4132j.add(new l0("", arrayList, 0, n0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.k) {
            n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f4142i;
            if (arrayList.size() <= 1) {
                d dVar = this.f4143j;
                f fVar = new f(this.f4134a, this.f4135b, this.f4136c, this.f4137d, this.f4138e, new h0(dVar.f4123a, dVar.f4124b, dVar.f4125c, dVar.f4126d, dVar.f4127e, dVar.f4128f, dVar.f4129g, dVar.f4130h, dVar.f4131i, dVar.f4132j), this.f4139f, this.f4140g, this.f4141h);
                this.k = true;
                return fVar;
            }
            if (this.k) {
                n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) arrayList.get(arrayList.size() - 1)).f4132j.add(new h0(dVar2.f4123a, dVar2.f4124b, dVar2.f4125c, dVar2.f4126d, dVar2.f4127e, dVar2.f4128f, dVar2.f4129g, dVar2.f4130h, dVar2.f4131i, dVar2.f4132j));
        }
    }
}

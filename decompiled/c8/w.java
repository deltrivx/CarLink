package c8;

import b8.m2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f2561d;

    public /* synthetic */ w(int i7, h9.k kVar, List list) {
        this.f2558a = 2;
        this.f2559b = list;
        this.f2561d = kVar;
        this.f2560c = i7;
    }

    public /* synthetic */ w(List list, int i7, h9.k kVar, int i10) {
        this.f2558a = i10;
        this.f2559b = list;
        this.f2560c = i7;
        this.f2561d = kVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f2558a) {
            case 0:
                ArrayList arrayListK0 = u8.p.K0(this.f2559b);
                int i7 = this.f2560c;
                int i10 = i7 - 1;
                m2 m2Var = (m2) arrayListK0.get(i10);
                arrayListK0.set(i10, arrayListK0.get(i7));
                arrayListK0.set(i7, m2Var);
                this.f2561d.invoke(arrayListK0);
                break;
            case 1:
                ArrayList arrayListK1 = u8.p.K0(this.f2559b);
                int i11 = this.f2560c;
                int i12 = i11 + 1;
                m2 m2Var2 = (m2) arrayListK1.get(i12);
                arrayListK1.set(i12, arrayListK1.get(i11));
                arrayListK1.set(i11, m2Var2);
                this.f2561d.invoke(arrayListK1);
                break;
            default:
                ArrayList arrayListK2 = u8.p.K0(this.f2559b);
                arrayListK2.remove(this.f2560c);
                this.f2561d.invoke(arrayListK2);
                break;
        }
        return t8.z.f12851a;
    }
}

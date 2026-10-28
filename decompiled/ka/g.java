package ka;

import java.util.ArrayList;
import x9.r0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7425b;

    public /* synthetic */ g(j jVar, int i7) {
        this.f7424a = i7;
        this.f7425b = jVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f7424a) {
            case 0:
                j jVar = this.f7425b;
                if (db.e.f(jVar) == null) {
                    return null;
                }
                ((ja.a) jVar.f7429g.f3847b).f6985w.getClass();
                return null;
            case 1:
                j jVar2 = this.f7425b;
                da.o oVar = jVar2.f7430h;
                ArrayList<da.c0> typeParameters = oVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(u8.q.a0(typeParameters, 10));
                for (da.c0 c0Var : typeParameters) {
                    r0 r0VarA = ((ja.f) jVar2.f7432j.f3848c).a(c0Var);
                    if (r0VarA == null) {
                        throw new AssertionError("Parameter " + c0Var + " surely belongs to class " + oVar + ", so it must be resolved");
                    }
                    arrayList.add(r0VarA);
                }
                return arrayList;
            default:
                return x9.v.c(this.f7425b);
        }
    }
}

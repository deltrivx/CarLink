package r9;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f11718b;

    public /* synthetic */ m1(n1 n1Var, int i7) {
        this.f11717a = i7;
        this.f11718b = n1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11717a) {
            case 0:
                n1 n1Var = this.f11718b;
                return n1Var.a(n1Var.f11727a);
            default:
                r1 r1Var = this.f11718b.f11728b;
                Type type = r1Var != null ? (Type) r1Var.invoke() : null;
                i9.l.b(type);
                return da.d.c(type);
        }
    }
}

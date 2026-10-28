package r9;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f11765b;

    public /* synthetic */ t0(v0 v0Var, int i7) {
        this.f11764a = i7;
        this.f11765b = v0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        u0 u0Var;
        List listD0;
        switch (this.f11764a) {
            case 0:
                return x1.d(this.f11765b.a());
            default:
                v0 v0Var = this.f11765b;
                x9.i0 i0VarA = v0Var.a();
                int i7 = v0Var.f11775b;
                r rVar = v0Var.f11774a;
                if ((i0VarA instanceof aa.a0) && i9.l.a(x1.g(rVar.j()), i0VarA) && rVar.j().f() == 2) {
                    x9.k kVarL = rVar.j().l();
                    i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK = x1.k((x9.e) kVarL);
                    if (clsK != null) {
                        return clsK;
                    }
                    throw new cc.a0(2, "Cannot determine receiver Java type of inherited declaration: " + i0VarA);
                }
                s9.g gVarG = rVar.g();
                if (gVarG instanceof s9.c0) {
                    if (rVar.m()) {
                        s9.c0 c0Var = (s9.c0) gVarG;
                        n9.d dVarA = c0Var.a(i7 + 1);
                        int i10 = c0Var.a(0).f8966b + 1;
                        listD0 = u8.p.D0(c0Var.f12667b.q(), new n9.d(dVarA.f8965a - i10, dVarA.f8966b - i10, 1));
                    } else {
                        s9.c0 c0Var2 = (s9.c0) gVarG;
                        listD0 = u8.p.D0(c0Var2.f12667b.q(), c0Var2.a(i7));
                    }
                    Type[] typeArr = (Type[]) listD0.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length == 0) {
                        throw new cc.a0("Expected at least 1 type for compound type");
                    }
                    if (length == 1) {
                        return (Type) u8.l.H0(typeArr2);
                    }
                    u0Var = new u0(typeArr2);
                } else {
                    if (!(gVarG instanceof s9.b0)) {
                        return (Type) gVarG.q().get(i7);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((s9.b0) gVarG).f12657d.get(i7)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 == 0) {
                        throw new cc.a0("Expected at least 1 type for compound type");
                    }
                    if (length2 == 1) {
                        return (Type) u8.l.H0(typeArr3);
                    }
                    u0Var = new u0(typeArr3);
                }
                return u0Var;
        }
    }
}

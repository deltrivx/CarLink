package u0;

import android.support.v4.media.session.r;
import b3.g0;
import b3.q0;
import f1.k1;
import g3.c0;
import g3.w;
import java.io.IOException;
import java.util.List;
import l0.s;
import l0.s1;
import l0.u0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12974b;

    public /* synthetic */ d(e eVar, int i7) {
        this.f12973a = i7;
        this.f12974b = eVar;
    }

    public /* synthetic */ d(e eVar, y2.j jVar) {
        this.f12973a = 3;
        this.f12974b = eVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) throws IOException {
        int i7 = this.f12973a;
        boolean z10 = true;
        e eVar = this.f12974b;
        switch (i7) {
            case 0:
                k1 k1Var = eVar.f12977s.f7866t;
                Boolean bool = Boolean.TRUE;
                k1Var.setValue(bool);
                eVar.f12977s.f7865s.setValue(bool);
                e.D0(eVar.f12977s, ((b3.h) obj).f1353b, eVar.f12978t);
                return bool;
            case 1:
                List list = (List) obj;
                if (eVar.f12977s.d() != null) {
                    s1 s1VarD = eVar.f12977s.d();
                    i9.l.b(s1VarD);
                    list.add(s1VarD.f7828a);
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                e.D0(eVar.f12977s, ((b3.h) obj).f1353b, eVar.f12978t);
                return Boolean.TRUE;
            default:
                b3.h hVar = (b3.h) obj;
                if (eVar.f12978t) {
                    c0 c0Var = eVar.f12977s.f7852e;
                    if (c0Var != null) {
                        List listJ = n3.l.J(new g3.i(), new g3.a(hVar, 1));
                        u0 u0Var = eVar.f12977s;
                        r rVar = u0Var.f7851d;
                        s sVar = u0Var.f7868v;
                        w wVarP = rVar.p(listJ);
                        c0Var.a(null, wVarP);
                        sVar.invoke(wVarP);
                    } else {
                        w wVar = eVar.f12976r;
                        String str = wVar.f5889a.f1353b;
                        long j5 = wVar.f5890b;
                        int i10 = q0.f1429c;
                        int i11 = (int) (j5 >> 32);
                        int i12 = (int) (j5 & 4294967295L);
                        i9.l.e(str, "<this>");
                        i9.l.e(hVar, "replacement");
                        if (i12 < i11) {
                            throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) str, 0, i11);
                        sb2.append((CharSequence) hVar);
                        sb2.append((CharSequence) str, i12, str.length());
                        String string = sb2.toString();
                        int length = hVar.f1353b.length() + ((int) (eVar.f12976r.f5890b >> 32));
                        eVar.f12977s.f7868v.invoke(new w(string, g0.b(length, length), 4));
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}

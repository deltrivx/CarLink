package f8;

import android.content.Context;
import com.tencent.bugly.crashreport.CrashReport;
import f1.s;
import f1.w1;
import fc.h0;
import i9.l;
import n8.q;
import t8.o;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7.h f5487a = v7.h.f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.f f5488b = v7.f.Test;

    @Override // v7.e
    public final void a() {
        String packageName = n8.a.b().getPackageName();
        l.d(packageName, "getPackageName(...)");
        if (j.r0(packageName, "debug", true)) {
            return;
        }
        o oVar = n8.d.f8898a;
        if (n8.d.a("TEST_LOGS_UPLOAD", true)) {
            CrashReport.initCrashReport(n8.a.b(), "742bc4bdd4", false);
            Context contextB = n8.a.b();
            o oVar2 = n8.h.f8903a;
            CrashReport.setDeviceModel(contextB, (String) n8.h.f8905c.getValue());
            CrashReport.setUserId((String) n8.h.f8904b.getValue());
        }
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        sVar.Y(-1158410125);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            i iVar = i.f5499a;
            h0 h0Var = q.f8931l;
            iVar.d(8, sVar);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 9, this);
        }
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        n3.l.c(sVar);
    }

    @Override // v7.e
    public final v7.h d() {
        return this.f5487a;
    }

    @Override // v7.e
    public final int e() {
        return 0;
    }

    @Override // v7.e
    public final int f() {
        return 999;
    }

    @Override // v7.e
    public final String g() {
        return "";
    }

    @Override // v7.e
    public final v7.f h() {
        return this.f5488b;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        n3.l.g(sVar);
    }
}

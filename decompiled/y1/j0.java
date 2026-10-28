package y1;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wb.b f14919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14920b = 9205357640488583168L;

    @Override // y1.m
    public final void a(float f10, long j5, f7.q qVar) {
        wb.b bVar = this.f14919a;
        if (bVar == null || !x1.e.a(this.f14920b, j5)) {
            if (x1.e.e(j5)) {
                this.f14919a = null;
                this.f14920b = 9205357640488583168L;
                bVar = null;
            } else {
                bVar = this.f14919a;
                if (bVar == null) {
                    bVar = new wb.b();
                    this.f14919a = bVar;
                }
                bVar.f14284a = b(j5);
                this.f14919a = bVar;
                this.f14920b = j5;
            }
        }
        long jC = h0.c(((Paint) qVar.f5447c).getColor());
        long j10 = q.f14948b;
        if (!q.c(jC, j10)) {
            qVar.k(j10);
        }
        if (!i9.l.a((Shader) qVar.f5448d, bVar != null ? (Shader) bVar.f14284a : null)) {
            qVar.n(bVar != null ? (Shader) bVar.f14284a : null);
        }
        if (((Paint) qVar.f5447c).getAlpha() / 255.0f == f10) {
            return;
        }
        qVar.i(f10);
    }

    public abstract Shader b(long j5);
}

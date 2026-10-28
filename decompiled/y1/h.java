package y1;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f14895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f14896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f14897c;

    public h(Path path) {
        this.f14895a = path;
    }

    public final x1.c a() {
        if (this.f14896b == null) {
            this.f14896b = new RectF();
        }
        RectF rectF = this.f14896b;
        i9.l.b(rectF);
        this.f14895a.computeBounds(rectF, true);
        return new x1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean b(e0 e0Var, e0 e0Var2, int i7) {
        Path.Op op;
        if (i7 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i7 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i7 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i7 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(e0Var instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((h) e0Var).f14895a;
        if (e0Var2 instanceof h) {
            return this.f14895a.op(path, ((h) e0Var2).f14895a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c() {
        this.f14895a.reset();
    }
}

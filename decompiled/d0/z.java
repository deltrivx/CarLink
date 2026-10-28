package d0;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3678d;

    public /* synthetic */ z(Object obj, int i7, int i10, int i11) {
        this.f3675a = i11;
        this.f3676b = obj;
        this.f3677c = i7;
        this.f3678d = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f3675a) {
            case 0:
                o2.u0.f((o2.u0) obj, (o2.v0) this.f3676b, this.f3677c, this.f3678d);
                break;
            case 1:
                o2.u0.f((o2.u0) obj, (o2.v0) this.f3676b, this.f3677c, this.f3678d);
                break;
            default:
                y1.h hVar = (y1.h) this.f3676b;
                b3.s sVar = (b3.s) obj;
                b3.b bVar = sVar.f1441a;
                int iD = sVar.d(this.f3677c);
                int iD2 = sVar.d(this.f3678d);
                CharSequence charSequence = bVar.f1311e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    h3.a.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                c3.n nVar = bVar.f1310d;
                nVar.f2408f.getSelectionPath(iD, iD2, path);
                int i7 = nVar.f2410h;
                if (i7 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i7);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sVar.f1446f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i10 = (int) 0;
                hVar.f14895a.addPath(path, Float.intBitsToFloat(i10), Float.intBitsToFloat(i10));
                break;
        }
        return t8.z.f12851a;
    }
}

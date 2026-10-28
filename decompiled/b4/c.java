package b4;

import android.graphics.Rect;
import android.view.View;
import f1.p0;
import h0.w0;
import h0.y;
import java.util.Comparator;
import q2.h0;
import r2.r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1475a;

    public /* synthetic */ c(int i7) {
        this.f1475a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1475a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b10 = bArr[i7];
                    byte b11 = bArr2[i7];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                t8.j jVar = (t8.j) obj;
                t8.j jVar2 = (t8.j) obj2;
                return (((Number) jVar.f12831b).intValue() - ((Number) jVar.f12830a).intValue()) - (((Number) jVar2.f12831b).intValue() - ((Number) jVar2.f12830a).intValue());
            case 2:
                return i9.l.f(((p0) obj).f5079b, ((p0) obj2).f5079b);
            case 3:
                return i9.l.f(((w0) obj2).f6402a, ((w0) obj).f6402a);
            case 4:
                return i9.l.f(((y) obj).getIndex(), ((y) obj2).getIndex());
            case 5:
                h0 h0Var = (h0) obj;
                h0 h0Var2 = (h0) obj2;
                float f10 = h0Var.F.f10743p.D;
                float f11 = h0Var2.F.f10743p.D;
                return f10 == f11 ? i9.l.f(h0Var.w(), h0Var2.w()) : Float.compare(f10, f11);
            case 6:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                s.h0 h0Var3 = r1.f11384d;
                Object objG = h0Var3.g(view);
                i9.l.b(objG);
                Rect rect = (Rect) objG;
                Object objG2 = h0Var3.g(view2);
                i9.l.b(objG2);
                Rect rect2 = (Rect) objG2;
                int i10 = rect.top - rect2.top;
                return i10 == 0 ? rect.bottom - rect2.bottom : i10;
            default:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                s.h0 h0Var4 = r1.f11384d;
                Object objG3 = h0Var4.g(view3);
                i9.l.b(objG3);
                Rect rect3 = (Rect) objG3;
                Object objG4 = h0Var4.g(view4);
                i9.l.b(objG4);
                Rect rect4 = (Rect) objG4;
                int i11 = rect3.left - rect4.left;
                return i11 == 0 ? (rect3.right - rect4.right) * r1.f11383c : r1.f11383c * i11;
        }
    }
}
